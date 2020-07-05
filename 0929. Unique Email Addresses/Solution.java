class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> seenEmails = new HashSet<>();
        for(String email : emails) {
            int i = email.indexOf('@');
            String local = email.substring(0, i);
            String rest = email.substring(i);

            if (local.contains("+")) {
                local = local.substring(0, local.indexOf('+'));
            }

            //escape '.' as it is treated as a regular expression
            local = local.replaceAll("\\.", "");

            seenEmails.add(local + rest);
        }
        return seenEmails.size();
    }
}
