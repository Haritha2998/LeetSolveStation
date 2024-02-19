class Solution {
    public int removeDuplicates(int[] nums) {
        int flag = 1;
        int pos =1;
        for(int i=1; i< nums.length; i++) {
            if(nums[i-1] == nums[i]) {
                flag--;
                if(flag < 0) {
                   while( i< nums.length && nums[i-1] == nums[i]) {
                       i++;
                   }
                   flag = 1;
                }
            }
            else  {
                flag = 1;
            }
            if(i<nums.length) nums[pos++] = nums[i];
            
        }
        return pos;
    }
}
