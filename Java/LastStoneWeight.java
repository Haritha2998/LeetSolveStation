class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i =0; i< stones.length;i++) {
            q.offer(stones[i]);
        }
        while(q.size() > 1) {
            int c = q.poll();
            int d = q.poll();
            q.offer(c-d);
        }
       return q.peek(); 
    }
}
