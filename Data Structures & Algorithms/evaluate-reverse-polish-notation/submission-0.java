class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for(String s: tokens){
            if(s.equals("+")){
                Integer sum = stack.pop() + stack.pop();
                stack.push(sum);
            }
            else if(s.equals("-")){
                Integer right = stack.pop();
                Integer diff =  stack.pop() - right;
                stack.push(diff);
            }
            else if(s.equals("/")){
                Integer right = stack.pop();
                Integer quotient =  stack.pop() / right;
                stack.push(quotient);
            }
            else if(s.equals("*")){
                Integer product = stack.pop() * stack.pop();
                stack.push(product);
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
        
    }
}
