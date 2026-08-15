class Solution {
    public int maxArea(int[] heights) {
        int left = 0, leftMax=0, rightMax=0, right=heights.length-1;
        int result = 0;

        while(left<right){
            leftMax = Math.max(heights[left], leftMax);
            rightMax = Math.max(heights[right], rightMax);
            int currentCapacity = Math.min(leftMax, rightMax) * (right-left);
            result = Math.max(result, currentCapacity);
            if(leftMax<=rightMax){
                left++;
            }
            else{
                right--;
            }

        }
        return result;


        
    }
}
