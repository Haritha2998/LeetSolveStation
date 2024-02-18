class Solution {
    public void wiggleSort(int[] nums) {
        for(int i = 1; i< nums.length; i = i+2) {
            if(nums[i] < nums[i-1]) {
                 int temp = nums[i-1];
                    nums[i-1] = nums[i];
                    nums[i] = temp; 
            }
            if(i != nums.length-1) {
            if(nums[i] < nums[i+1]) {
                    int temp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = temp;
                }
            }
            }

        }
    }

