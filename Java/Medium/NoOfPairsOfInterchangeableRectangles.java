class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double, Long> map = new HashMap<>();
       for(int i = 0; i< rectangles.length; i++) {
           double ratio = (double) rectangles[i][0]/rectangles[i][1];
           map.put(ratio, map.getOrDefault(ratio, (long)0)+1);
       }
       long interchangeable=0;
       for(Map.Entry<Double, Long> entry: map.entrySet()) {
           long ratioCount = entry.getValue()-1;
           interchangeable += (ratioCount*(ratioCount+1)) / 2;
       }
       return interchangeable; 
    }
}
