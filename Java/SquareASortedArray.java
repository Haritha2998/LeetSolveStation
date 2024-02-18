class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int i=0;
        while( i <nums.length) {
            if (nums[i] > 0) break;
            i++;
        }
        int j = i-1;
        int k=0;
        while(j>=0 && i<nums.length) {
            if(Math.abs(nums[j]) > Math.abs(nums[i])) {
                result[k++] = (int) Math.pow(nums[i++], 2);
            }
            else {
                result[k++] = (int) Math.pow(nums[j--], 2);
            }
        }
        while(j>=0) {
            result[k++] = (int) Math.pow(nums[j--], 2);
        }
        while(i<nums.length) {
            result[k++] = (int) Math.pow(nums[i++], 2);
        }
        return result;
    }
}
