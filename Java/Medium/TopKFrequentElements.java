class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Queue<Integer> q = new PriorityQueue<>(
            (m, n) -> map.get(m) - map.get(n)
        );
        for(int n: map.keySet()) {
            q.offer(n);
            if(q.size()> k) {
                q.poll();
            }
        }
        int[] res = new int[k];
        for(int i = 0; i<k; i++) {
            res[i] = q.poll();
        }
        return res;
    }
}
