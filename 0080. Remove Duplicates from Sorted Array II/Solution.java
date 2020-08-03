class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        // initialize counter and the second pointer
        int j = 1;
        int count = 1;

        // start from the second index processing elements one by one
        for (int i = 1; i < nums.length; i++) {

            // if element is a duplicate, increment the count
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {

                // reset counter as we have encountered a different element
                count = 1;
            }

            // for count <= 2, we copy th eelement over, thus overwriting the element
            // at index 'j' in the array
            if (count <= 2) {
                nums[j++] = nums[i];
            }
        }

        return j;
    }
}
