class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(Character c: s.toCharArray()){
            if(c=='{' || c=='(' || c=='['){
                stack.push(c);
            }
            else if(stack.size()==0){
                return false;
            }
            else if(c=='}' && '{'!=stack.peek()){
                    return false;
                }
            else if(c==']' && '['!=stack.peek()){
                    return false;
                }
            else if(c==')' && '('!=stack.peek()){
                    return false;
                }
            else{
                    stack.pop();
                }
            
            
        }
        return stack.size()==0;
    }
}
