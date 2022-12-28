class MyQueue {
    Stack<Integer> mainStack;
    Stack<Integer> helperStack;
    private int front;

    public MyQueue() {
        mainStack = new Stack<>();
        helperStack = new Stack<>();
    }
    
    public void push(int x) {
        if(mainStack.size() == 0){
            front = x;
        }

        mainStack.push(x);
    }
    
    public int pop() {
        if(helperStack.size() == 0){
            while(mainStack.size() > 0){
                helperStack.push(mainStack.pop());
            }
        }
        return helperStack.pop();
    }
    
    public int peek() {
        if(helperStack.size() > 0){
            return helperStack.peek();
        }

        return front;
    }
    
    public boolean empty() {
        return mainStack.empty() && helperStack.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */ 