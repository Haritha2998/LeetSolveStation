class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        int half = num/2;
       while((long)half*half > num) {
           half = half/2;
       } 
       for(int i = half; i<half*2; i++) {
           if(i*i == num) return true;
       }
       return false;
    }
}
