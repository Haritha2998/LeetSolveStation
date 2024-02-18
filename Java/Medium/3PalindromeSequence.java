class Solution {
    public int countPalindromicSubsequence(String s) {
        int seq =0;
        int[] start = new int[26];
        int[] end = new int[26];
        Arrays.fill(start,-1);
        Set<Character> letters = new HashSet<>();
         for(int i=0; i< s.length(); i++) {
            letters.add(s.charAt(i));
            int pos = s.charAt(i) - 'a';
            if(start[pos] == -1) {
                start[pos] = i;
            }
           end[pos] = i;
         }
         for(Character c : letters) {
             Set<Character> between = new HashSet<>();
             for(int i = start[c-'a']+1; i< end[c-'a']; i++) {
                 between.add(s.charAt(i));
             }
             seq += between.size();
         }
        return seq;
    }
}
