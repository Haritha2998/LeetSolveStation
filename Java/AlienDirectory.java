class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for(int i = 1; i< words.length; i++) {
            int j =0;
            while(j < words[i-1].length() && j < words[i].length() && words[i-1].charAt(j) == words[i].charAt(j)) {
                j++;
            }
            if(j == words[i-1].length()) continue;
            if(j == words[i].length() || order.indexOf(words[i-1].charAt(j)) > order.indexOf(words[i].charAt(j))) return false;
        }
        return true;
    }
}
