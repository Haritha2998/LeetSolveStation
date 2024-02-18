class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length() < 11) return new ArrayList<>();
        int i =0;
        HashSet<String> set = new HashSet<>();
        HashSet<String> op = new HashSet<>();
       
        while(i < s.length()-10+1) {
            String sub = s.substring(i, i+10);
            if (set.contains(sub)) {
                op.add(sub);
            }
            else {
                set.add(sub);
            }
            i++;
        }
         List<String> l = new ArrayList<>(op);
        return l;
    }
}`
