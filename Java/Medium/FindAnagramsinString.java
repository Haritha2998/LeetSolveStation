class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l = new ArrayList<>();
        //Commented code works for non duplicate anagram string instead of baaa, cdd
        // for(int i =0; i<s.length()-p.length()+1;i++) {
        // HashSet<Character> set = new HashSet<>();
        // for(int j = i; j < i+p.length(); j++) {
        // if (p.indexOf(s.charAt(j)) == -1) break;
        // set.add(s.charAt(j));
        // }
        // if(set.size() == p.length()) {
        // l.add(i);
        // }
        // }
        char[] pChars = p.toCharArray();
        Arrays.sort(pChars);
        String pSorted = new String(pChars);
        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            String sub = s.substring(i, i + p.length());
            char[] subChar = sub.toCharArray();
            Arrays.sort(subChar);
            String sSorted = new String(subChar);
            if(sSorted.equals(pSorted)) {
                l.add(i);
            }
        }
        return l;
    }
}
