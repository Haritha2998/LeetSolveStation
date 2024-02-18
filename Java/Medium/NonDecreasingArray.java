class Solution {
    public boolean checkPossibility(int[] nums) {
        int flag =1;
        for (int i=0; i< nums.length-1; i++) {
            if(nums[i] > nums[i+1]) {
                flag--;
                if (flag < 0) return false;
                if(i == 0) {
                   nums[i] = nums[i+1];
                }
                else {
                    if (nums[i-1] <= nums[i+1]) nums[i] = nums[i+1];
                    else nums[i+1] = nums[i];
                }
            }
        }
        return true;
    }
}
