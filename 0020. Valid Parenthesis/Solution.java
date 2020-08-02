class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        }

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)) {

                // get the top element of the stack, if empty, set to a dummy value
                char topElement = stack.isEmpty() ? '#' : stack.pop();

                // if mapping does not match the stack's top, return false
                if (topElement != map.get(c)) {
                    return false;
                }
            } else {
                // this was an opening bracket, push to stack
                stack.push(c);
            }
        }

        // if stack still contains elements, then it is an invalid expression
        return stack.isEmpty();
    }
}
