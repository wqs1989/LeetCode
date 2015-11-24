public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if((m+n)%2 == 1)
            return findKth(nums1,0,m-1,nums2,0,n-1,(m+n)/2+1);
        else
            return (findKth(nums1,0,m-1,nums2,0,n-1,(m+n)/2)+
                    findKth(nums1,0,m-1,nums2,0,n-1,(m+n)/2+1))*0.5;
            
    }
    public double findKth(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
        int index1 = 0, index2 = 0;
        int length1 = end1-start1+1, length2 = end2-start2+1;
        if(length1 <= 0)
            return nums2[k+start2-1];
        else if(length1>length2)
            return findKth(nums2, start2,end2,nums1,start1,end1,k);
        else if(k == 1)
            return Math.min(nums1[start1],nums2[start2]);
        
        index1 = Math.min(k/2,length1);
        index2 = k - index1;
        if(nums1[start1+index1-1] == nums2[start2+index2-1])
            return nums1[start1+index1-1];
        else if(nums1[start1+index1-1] < nums2[start2+index2-1])
            return findKth(nums1,start1+index1,end1,nums2,start2,end2,k-index1);
        else
            return findKth(nums1,start1,end1,nums2,start2+index2,end2,k-index2);
    }
}