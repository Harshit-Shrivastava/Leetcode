class SolutionAlternate {
    public String[] reorderLogFiles(String[] logs) {
        
        //null check
        if (logs == null || logs.length == 0) {
            return logs;
        }
        
        List<String> letterList = new ArrayList<>();
        List<String> digitList = new ArrayList<>();
        
        for (String log : logs) {
            String[] elements = log.split(" ");
            if (Character.isLetter(elements[1].charAt(0))) {
                letterList.add(log);
            } else {
                digitList.add(log);
            }
        }
        
        letterList.sort((o1, o2) -> {
            
            String[] s1 = o1.split(" ");
            String[] s2 = o2.split(" ");
            int len1 = s1.length;
            int len2 = s2.length;
            String id1 = s1[0];
            String id2 = s2[0];
            
            for (int i = 1; i < Math.min(len1, len2); i++) {
                if (!s1[i].equals(s2[i])) {
                    return s1[i].compareTo(s2[i]);
                } else if (i == Math.min(len1, len2) -1 && s1[i].equals(s2[i])) {
                    return id1.compareTo(id2);
                }
            }
            
            return 0;
            
        });
        
        for (int i = 0; i < logs.length; i++) {
            if (i < letterList.size()) {
                logs[i] = letterList.get(i);
            } else {
                logs[i] = digitList.get(i - letterList.size());
            }
        }
        
        return logs;
    }
}