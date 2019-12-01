class Solution {
    public int calculateTime(String keyboard, String word) {
        int result = 0;
        int curIndex = 0;
        
        for(int i = 0; i < word.length(); i++) {
            int newIndex = keyboard.indexOf(word.charAt(i));
            result += Math.abs(newIndex - curIndex);
            curIndex = newIndex;
        }
        
        return result;
    }
}