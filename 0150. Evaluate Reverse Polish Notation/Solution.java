class Solution {
    public int evalRPN(String[] tokens) {

        if (tokens.length == 0) {
            return 0;
        }

        Stack<Integer> stack = new Stack();

        for (int i = 0; i < tokens.length; i++) {
            String s = tokens[i];
            if (!(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))) {
                stack.push(Integer.parseInt(s));
            } else {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(getResult(b, a, s));
            }
        }
        return stack.pop();
    }

    private int getResult(int a, int b, String s) {
        if (s.equals("+")) {
            return a + b;
        } else if (s.equals("-")) {
            return a - b;
        } else if (s.equals("*")) {
            return a * b;
        } else {
            return a / b;
        }
    }
}
