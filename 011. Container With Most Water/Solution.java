class Solution {
    public int maxArea(int[] height) {

        int start = 0;
        int end = height.length - 1;
        int maxArea = 0;

        while(start < end) {
            int smaller = Math.min(height[start], height[end]);
            maxArea = Math.max(maxArea, Math.abs((start - end) * (smaller)));

            if(height[start] > smaller) {
                end--;
            } else {
                start++;
            }
        }
        return maxArea;
    }
}
