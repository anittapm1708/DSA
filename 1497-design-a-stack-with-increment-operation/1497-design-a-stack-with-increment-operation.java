class CustomStack {
    int top;
    int[] stack;
    int size;
    int currSize;
    public CustomStack(int maxSize) {
        size = maxSize;
        top=-1;
        stack = new int[size];
        currSize=0;
    }
    
    public void push(int x) {
        
        if(currSize<size){
            stack[++top]=x;
            currSize++;
        }
    }
    
    public int pop() {
        if(currSize!=0){
            currSize--;
            return stack[top--];
        }
        else{
            return -1;
        }
    }
    
    public void increment(int k, int val) {
        int min= Math.min(k,currSize);
        for(int i=0;i<min;i++){
            stack[i]=val+stack[i];
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