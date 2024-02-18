class Solution {
    public int removeElement(int[] nums, int val) {
        int length = nums.length-1;
        for (int i =0; i<= length; i++) {
            if (nums[i] == val) {
                while(i < length && nums[length] == val) {
                    length--;
                }
                nums[i] = nums[length];
                length--;
            }
        }
        return length+1;
    }
}
