class Queue {
private:
    stack<int> myStack;
public:
    // Push element x to the back of queue.
    void push(int x) {
        stack<int> tempStack;
        while (!myStack.empty()){
            tempStack.push(myStack.top());
            myStack.pop();
        }
        myStack.push(x);
        while (!tempStack.empty()){
            myStack.push(tempStack.top());
            tempStack.pop();
        }
    }

    // Removes the element from in front of queue.
    void pop(void) {
        myStack.pop();
    }

    // Get the front element.
    int peek(void) {
        return myStack.top();
    }

    // Return whether the queue is empty.
    bool empty(void) {
        return myStack.empty();
    }
};