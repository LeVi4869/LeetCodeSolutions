class CustomStack {
    Stack<Integer> stack;
    int lim;
    public CustomStack(int maxSize) {
        stack = new Stack<Integer>();
        lim = maxSize;
    }
    
    public void push(int x) {
        if(stack.size() != lim){
            stack.push(x);
        }
    }
    
    public int pop() {
        if(stack.size() == 0){
            return -1;
        }
        return stack.pop();
    }
    
    public void increment(int k, int val) {
        Stack<Integer> tempStack = new Stack<Integer>();
        for(int i = stack.size(); i > 0; --i){
            if(i <= k){
                tempStack.push(stack.pop() + val);
            }
            else{
                tempStack.push(stack.pop());
            }
        }
        stack = new Stack<Integer>();
        for(int i = tempStack.size(); i > 0; --i){
            stack.push(tempStack.pop());
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */