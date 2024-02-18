class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int i = str2.length();
        for(i = i; i>1; i--) {
            if (str2.length()%i == 0 && str1.length()%i == 0) break;
        }
       String GCD = str2.substring(0, i);
       String result = GCD.repeat(str1.length()/i);
       if (result.equals(str1) && GCD.repeat(str2.length()/i).equals(str2)) return GCD;
       return "";
}
}
