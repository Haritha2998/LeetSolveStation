class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> mails = new HashSet<String>();
        for (int i =0; i< emails.length; i++) {
            String[] email = emails[i].split("@");
            email[0] = email[0].replace(".","");
            int ind = email[0].indexOf('+');
            if (ind >= 0) {
                email[0] = email[0].substring(0, ind);
            }
            mails.add(email[0]+'@'+email[1]);
        }
        return mails.size();
    }
}
