class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> map  = new HashMap<>();
       for(int i =0; i< nums.length; i++) {
           if(map.containsKey(nums[i])) {
               int[] arr = {map.get(nums[i]), i};
                return arr;
           }
           map.put(target - nums[i], i);
       }
       return null;
    }
}
