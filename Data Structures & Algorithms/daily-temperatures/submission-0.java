class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int[] result = new int[temperatures.length];
        int i = 1;
        while(i<temperatures.length){
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                result[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
            i++;
        }
        
        return result;

    }
}
