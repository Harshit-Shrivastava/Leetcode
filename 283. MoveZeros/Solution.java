public class Solution {
    public void moveZeroes(int[] nums) {
        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[temp++] = nums[i];
            }
        }
        while(temp < nums.length){
            nums[temp++] = 0;
        }
    }
}

class OtherSolution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}