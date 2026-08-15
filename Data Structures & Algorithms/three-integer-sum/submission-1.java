class Solution {
    /*
        input at leat 3 numbers
        nums[i] + nums[j] + nums[k] == 0
        nums[i]  == - nums[j] - nums[k]
        - nums[i]  == (nums[j] + nums[k])

        1. at least 3 numbers in input
        2. return empty list if no result.
    */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++){
            if(nums[i]>0){
                break;
            }
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            
            int left = i+1, right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                }
                else if(sum<0){
                    left++;
                }
                else right--;
            }
            
        }
        return result;

          

    }

    


}
