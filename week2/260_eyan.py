class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        dic = {}
        for num in nums:
            if num in dic:
                del(dic[num])
            else:
                dic[num] = 1
        
        return dic.keys()