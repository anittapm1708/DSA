class Solution {
    private boolean isNumber(String num){
        try{
            Integer.parseInt(num);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
    private boolean isOperator(String op){
        return(op.equals("+")||op.equals("-")||op.equals("*")||op.equals("/"));
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack= new Stack<>();
        for(String s:tokens){
            if(isNumber(s)){
                stack.push(Integer.parseInt(s));
            }
            else if(isOperator(s)){
                int b=stack.pop();
                int a=stack.pop();
                switch(s){
                    case "+":
                    stack.push(a+b);
                    break;
                    case "-":
                    stack.push(a-b);
                    break;
                    case "*":
                    stack.push(a*b);
                    break;
                    case "/":
                    stack.push(a/b);
                    break;
                }
            }
        }
        return stack.peek();
    }
}