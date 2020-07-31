class Solution {
    public void moveZeroes(int[] nums) {
        int cur = 0, lastNonZero = 0;

        while (cur < nums.length) {
            if (nums[cur] != 0) {
                int temp = nums[cur];
                nums[cur] = nums[lastNonZero];
                nums[lastNonZero] = temp;
                cur++;
                lastNonZero++;
            } else {
                cur++;
            }
        }
    }
}
