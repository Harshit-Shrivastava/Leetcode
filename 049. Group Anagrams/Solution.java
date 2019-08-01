class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //null check
        if (strs.length == 0) {
            return new ArrayList();
        }    
        
        //create a map for results
        Map<String, List> result = new HashMap<>();
        
        //add strings to map
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            
            String key = String.valueOf(charArray);
            
            if (!result.containsKey(key)) {
                result.put(key, new ArrayList());
            } 
            result.get(key).add(s);
        }
        
        //convert resultant map to array list
        return new ArrayList(result.values());
    }
}