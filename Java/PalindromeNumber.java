class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int k = x;
        int sum =0;
        while(k>0) {
            sum = sum*10 + k%10;
            k = k/10;
        }
        return x == sum;
    }
}
