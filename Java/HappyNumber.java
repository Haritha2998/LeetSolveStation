class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        int k =n;
        while(!set.contains(sum)) { 
            set.add(k);  
            sum=0;
            while(k>0) {
                sum = sum + (int)Math.pow(k%10, 2);
                k = k/10;
            }
            if (sum == 1) return true;
            k = sum;
            
        }
        return false;
    }
}
