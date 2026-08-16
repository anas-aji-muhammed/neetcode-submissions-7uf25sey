class Solution {
    public int search(int[] nums, int target) {
        int l=0, r=nums.length-1;
        while(l<r){
            int mid = (l+r)/2;
            if(nums[mid]>nums[r]){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        int pivot = l;
        int result = binarySearch(nums, target, 0, pivot);
        if(result==-1){
            result = binarySearch(nums, target, pivot, nums.length-1);
        }
        return result;
    }

    public int binarySearch(int[] nums, int target, int l, int r){
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
}
