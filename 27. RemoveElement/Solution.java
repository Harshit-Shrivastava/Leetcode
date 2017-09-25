class Solution {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        if(length == 0){
            return 0;
        }
        int end = length -1;
        for(int i = length -1; i >= 0; i--){
            if(nums[i] == val){
                int temp = nums[i];
                nums[i] = nums[end];
                nums[end] = temp;
                end--;
            }
        }
        return end + 1;
    }
}