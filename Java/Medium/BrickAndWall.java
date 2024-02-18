class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0 ; i< wall.size(); i++) {
            int sum = 0;
            for(int j = 0; j < wall.get(i).size()-1; j++) {
                sum = sum+wall.get(i).get(j);
                map.put(sum, map.getOrDefault(sum, 0)+1);
            }
        }
        int min = wall.size();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            min = Math.min(min, wall.size() - map.get(entry.getKey()));
        }
        return min;
    }
}
