class Solution {
    public int bestClosingTime(String customers) {
        int totalPenalty = 0;
        for (int i =0; i< customers.length(); i++) {
            totalPenalty += customers.charAt(i) == 'Y' ? 1:0;
        }
        int close =0, open =totalPenalty;
        int minPenalty = close+open;
        int minHour = 0;
        for( int i=1; i<= customers.length(); i++) {
            if(customers.charAt(i-1) == 'Y') open--;
            if(customers.charAt(i-1) == 'N') close++;
            if(minPenalty > open+close) {
                minPenalty = open+close;
                minHour = i;
            }
        }
        return minHour;
    }
}
