class Solution {
    public int arrangeCoins(int n) {
        int i=1, count=0 ;
        long c=0;
        while(c+i<n)  {
            c=c+i;
            i++;
            count++;
        }
        if(c+i == n) return count+1;
        else return count;
    }
    }

