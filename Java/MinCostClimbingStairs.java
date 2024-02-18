class Solution {
    int[] arr = new int[1001];
    public int minCostClimbingStairs(int[] cost) {
        int c = calculateMinCost(0, cost);
        int d = calculateMinCost(1, cost);
        return Math.min(c, d);
    }
    public int calculateMinCost(int i, int[] cost) {
        if(i >= cost.length) return 0;
        if (arr[i] == 0) arr[i] = Math.min(calculateMinCost(i+1, cost), calculateMinCost(i+2, cost));
        return cost[i] + arr[i];
    }
}
