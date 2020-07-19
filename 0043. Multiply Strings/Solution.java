class Solution {
    public String multiply(String num1, String num2) {

        // handle multiply by 0 case
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int[] nums = new int[num1.length() + num2.length()];

        // scan from back to head and store in reverse order in nums
        for (int i = 0; i < num1.length(); i++) {
            for (int j = 0; j < num2.length(); j++) {
                nums[i+j] += (num1.charAt(num1.length() - i - 1) - '0') *
                                (num2.charAt(num2.length() - j - 1) - '0');
            }
        }

        int carry = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i] + carry;
            nums[i] = sum % 10;
            carry = sum / 10;
        }

        StringBuilder sb = new StringBuilder();

        if (nums[nums.length - 1] != 0) {
            sb.append(nums[nums.length - 1]);
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            sb.append(nums[i]);
        }

        return sb.toString();
    }
}
