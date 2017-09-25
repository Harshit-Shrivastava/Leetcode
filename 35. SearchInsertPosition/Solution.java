class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
            if(nums[i] >= target){
                if((i -1) == -1){
                    return 0;
                }
                else{
                    return i;
                }
            }
        }
        return nums.length;
    }
}