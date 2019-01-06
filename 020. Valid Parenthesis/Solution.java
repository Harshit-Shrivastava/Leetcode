class Solution {
    public boolean isValid(String t) {
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < t.length() ; i++){
            char c = t.charAt(i);
            if(c == '('){
                s.push(')');
            } else if(c == '{'){
                s.push('}');
            } else if(c == '['){
                s.push(']');
            } else {
                try{
                   if(c != s.pop())
                        return false;
                } catch (Exception e){
                    //catch EmptyStackException
                    return false;
                }
            }
        }
        if(s.empty()){
            return true;
        }
        return false;
    }
}