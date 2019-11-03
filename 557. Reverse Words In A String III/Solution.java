class Solution {
    public String reverseWords(String s) {
        String[] parts = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String part : parts) {
            StringBuilder sb = new StringBuilder();
            sb.append(part);
            result.append(sb.reverse());
            result.append(" ");
        }
        return result.toString().trim();
    }
}