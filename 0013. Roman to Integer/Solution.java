class Solution {

    static Map<String, Integer> values = new HashMap<>();

    static{
        values.put("M", 1000);
        values.put("D", 500);
        values.put("C", 100);
        values.put("L", 50);
        values.put("X", 10);
        values.put("V", 5);
        values.put("I", 1);
    }

    public int romanToInt(String s) {

        int total = 0;
        int i = 0;

        while(i < s.length()) {
            String curSymbol = s.substring(i, i + 1);
            int curValue = values.get(curSymbol);
            int nextValue = 0;

            if(i + 1 < s.length()) {
                String nextSymbol = s.substring(i + 1, i + 2);
                nextValue = values.get(nextSymbol);
            }

            if(curValue < nextValue) {
                total = total + nextValue - curValue;
                i += 2;
            } else {
                total = total + curValue;
                i +=1;
            }
        }
        return total;
    }
}
