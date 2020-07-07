class Solution {
    public int myAtoi(String str) {
        int index = 0, sign = 1;

        //empty string
        if(str.length() == 0) {
            return 0;
        }

        //remove spaces
        while (index < str.length() && str.charAt(index) == ' ') {
            index++;
        }

        //handle signs
        if(index < str.length() && (str.charAt(index) == '+' || str.charAt(index) == '-')) {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        if (index < str.length() && !Character.isDigit(str.charAt(index))) {
            return 0;
        }

        int result = 0;

        //convert number and avoid overflow
        while(index < str.length()) {
            if (!Character.isDigit(str.charAt(index))) {
                break;
            }

            char current = str.charAt(index);

            int previous = result;
            result *= 10;

            if (previous != result/10) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result += (current - '0');

            if (result < 0) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            index++;
        }

        return result * sign;
    }
}
