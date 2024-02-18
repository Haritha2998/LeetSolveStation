class KthLargest {
    private int k;
    private PriorityQueue<Integer> desc;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        desc = new PriorityQueue<>();
        for (int num : nums) {
            desc.offer(num);
        }
    }
    
    public int add(int val) {
        desc.offer(val);
        int i=0;
        while(desc.size()>this.k) {
            desc.poll();
            i++;
        } 
        return desc.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
