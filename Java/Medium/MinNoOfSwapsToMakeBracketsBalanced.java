class Solution {
    public int minSwaps(String s) {
        int maxClosedBrackets = 0;
        int sum =0;
        for(Character i: s.toCharArray()) {
            if(i== ']') sum+=1;
            else sum-=1;
            maxClosedBrackets = Math.max(maxClosedBrackets, sum);
        }
        return (maxClosedBrackets+1) / 2;
    }
}
