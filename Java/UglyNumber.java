class Solution {
    public boolean isUgly(int n) {
        if(n<1) return false;
        int[] set = {2, 3, 5};
        while(n > 1) {
            if(n%set[0] == 0) n=n/2;
            else if(n%set[2] == 0) n=n/5;
            else if(n%set[1] == 0) n=n/3;
            else return false;
        }
        return true;
        
    }
}
