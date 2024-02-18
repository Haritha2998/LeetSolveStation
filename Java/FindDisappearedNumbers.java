class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] visited = new int[nums.length];
        List<Integer> ret = new ArrayList<>();
        for(int i =0; i< nums.length; i++) {
            visited[nums[i]-1] = 1;
        }
        for(int i =0; i< nums.length; i++) {
            if (visited[i] == 0) {
                ret.add(i+1);
            }
        }
        return ret;
    }
}
