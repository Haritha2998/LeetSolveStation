class Solution {
    public int missingNumber(int[] nums) {
        int k = 0;
        for(int i =1; i<= nums.length; i++) {
            k^= i^ nums[i-1];
        }
        return k;
    }
}
