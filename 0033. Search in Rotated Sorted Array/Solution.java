class Solution {
    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;

        while (lo <= hi) {

            // to prevent overflow
            int mid = lo + (hi - lo) / 2;

            // base condition, target == mid
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] >= nums[lo]) {

                if (target >= nums[lo] && target < nums[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if (target <= nums[hi] && target > nums[mid]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }

        }

        return -1;
    }
}
