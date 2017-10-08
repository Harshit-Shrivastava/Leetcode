class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxTillNow = 0;
        int curMax = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                if(curMax > maxTillNow){
                    maxTillNow = curMax;
                }
                curMax = 0;
            }
            else{
                curMax++;
            }
        }
        if(curMax > maxTillNow){
            maxTillNow = curMax;
        }
        return maxTillNow;
    }
}