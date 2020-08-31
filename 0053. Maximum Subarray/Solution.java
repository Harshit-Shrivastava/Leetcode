class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int curSum = nums[0], maxSum = nums[0];

        for (int i = 1; i < n; i++) {
            curSum = Math.max(nums[i], curSum + nums[i]);
            maxSum = Math.max(maxSum, curSum);
        }

        return maxSum;
    }
}
