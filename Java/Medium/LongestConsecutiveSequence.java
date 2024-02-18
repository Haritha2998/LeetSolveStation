class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums) {
            set.add(num);
        }
        int maxCount = 0;
        int currentCount =0;
        for(int num: nums) {          
            if(!set.contains(num-1) && set.contains(num)) 
            {
                while(set.contains(num)) {
                    currentCount++;
                    set.remove(num);
                    num = num+1;
                }
                maxCount = Math.max(maxCount, currentCount);
            }
            currentCount =0;
        }
        return maxCount;
    }
}
