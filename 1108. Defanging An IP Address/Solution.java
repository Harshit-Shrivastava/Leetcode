class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < address.length(); i++) {
            char cur = address.charAt(i);
            if(cur == '.'){
                sb.append("[.]");
            } else {
                sb.append(cur);
            }
        }
        
        return sb.toString();
    }
}