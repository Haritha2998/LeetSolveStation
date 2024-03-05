class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        nums = reverse(0, nums.length-1, nums);
        nums = reverse(0, k-1, nums);
        nums= reverse (k, nums.length-1, nums);
    }
    public int[] reverse(int start, int end, int[] nums) {
        while(start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
        return nums;
    }
}
