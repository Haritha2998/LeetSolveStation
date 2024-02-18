class Solution {
    public void moveZeroes(int[] nums) {
      int zeroPtr=0;
      int numPtr =0;
      while(numPtr < nums.length && zeroPtr < nums.length) {
          if(nums[zeroPtr] != 0) {
              zeroPtr++;
          }
          else if(nums[numPtr] == 0 || numPtr < zeroPtr) {
              numPtr++;
          }
          else {
          nums[zeroPtr++] = nums[numPtr];
          nums[numPtr++] = 0;
          }
      }
    }
}
