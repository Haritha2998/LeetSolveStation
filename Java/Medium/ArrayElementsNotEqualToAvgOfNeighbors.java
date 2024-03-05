class Solution {
    public int[] rearrangeArray(int[] nums) {
       Arrays.sort(nums);
       int[] balancedArr = new int[nums.length];
       int i =0, j= ((nums.length-1)/2)+1, k =0; 
       while(i<=(nums.length-1)/2 && j< nums.length) {
           balancedArr[k++] = nums[i++];
           balancedArr[k++] = nums[j++];
       }
       if(i<=(nums.length-1)/2) {
           balancedArr[k] = nums[i];
       }
       return balancedArr;
    }
}
