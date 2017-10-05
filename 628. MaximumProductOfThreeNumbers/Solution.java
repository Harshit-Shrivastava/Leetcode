class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 0){
            return 0;
        }
        else if(nums.length == 1){
            return nums[nums.length -1];
        }
        else if(nums.length == 2){
            return nums[nums.length -1] * nums[nums.length -2];
        }
        else{
            return nums[nums.length -1] * nums[nums.length -2] * nums[nums.length -3];
        }
    }
}