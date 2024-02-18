class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
       int[][] result = new int[grid.length][grid[0].length];
       while(k>0) {
           for(int i=0; i< grid.length; i++) {
               for(int j =0 ;j< grid[0].length; j++) {
                   if (j == grid[0].length-1 && i+1 < grid.length) {
                       result[i+1][0] = grid[i][j];
                   }
                    else if (j == grid[0].length-1 && i == grid.length-1) {
                       result[0][0] = grid[i][j];
                    }
                    else {
                       result[i][j+1] = grid[i][j]; 
                    }
               }
           }
           k--;
           grid = result;
           result = new int[grid.length][grid[0].length];
       }
       List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i< grid.length; i++) {
               List<Integer> rList = new ArrayList<>();
               list.add(rList);
               for(int j =0 ;j< grid[0].length; j++) {
                   rList.add(grid[i][j]);
               }}
            return list;
    }
}
