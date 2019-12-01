class Solution {
    public String removeVowels(String S) {
        StringBuilder sb = new StringBuilder();
        
        //create the vowel set
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        //check for vowels
        for (int i = 0; i < S.length(); i++) {
            char a = S.charAt(i);
            if(!vowels.contains(a)){
                sb.append(a);
            }
        }
        
        return sb.toString();
    }
}