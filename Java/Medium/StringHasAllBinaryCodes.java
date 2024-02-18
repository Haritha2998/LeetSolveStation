class Solution {
    public boolean hasAllCodes(String s, int k) {
         int n = 1 << k;
        HashSet<String> code = new HashSet<>(); 
        for(int i=0; i+k <= s.length(); i++) {
            String sub = s.substring(i, i+k);
            if(!code.contains(sub)) {
                code.add(sub);
                n--;
                if(n==0) return true;
            }
        }
        return false;
    }
}
