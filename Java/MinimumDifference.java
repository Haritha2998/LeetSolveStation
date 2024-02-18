class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length == 1 || k == 1) return 0;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int i =0;
        while(i<=nums.length-k){
            min = Math.min(nums[i+k-1] - nums[i], min);
            i++;
        }
        return min;
    }
}
