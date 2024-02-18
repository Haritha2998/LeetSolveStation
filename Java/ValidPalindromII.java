class Solution {
    public boolean validPalindrome(String s) {
        int canDelete = 1;
        for (int i=0, j = s.length() -1; i<j; i++, j--) {
            if(s.charAt(i) != s.charAt(j)) {
                if (checkPalindrome(s, i+1, j)) {
                    canDelete--;
                    i++;
                }
                else if (checkPalindrome(s, i, j-1)) {
                    canDelete--;
                    j--;
                }
                else return false;
            }
        }
        return true;
    }
    public boolean checkPalindrome(String s, int i, int j) {
        while(i<j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
