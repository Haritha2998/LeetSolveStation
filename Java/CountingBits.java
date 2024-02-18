class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i =0; i<=n; i++) {
            String s = Integer.toBinaryString(i);
            int c = 0, j=0;
            while(j<s.length()) {
                if(s.charAt(j) == '1') c++;
                j++;
            }
            arr[i] = c;
        }
        return arr;
    }
}
