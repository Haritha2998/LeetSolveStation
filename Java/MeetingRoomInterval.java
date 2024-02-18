class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare (int[] entry1, int[] entry2) {
                if(entry1[1] > entry2[1]) return 1;
                return -1;
            }
        } );
        for(int i = 0; i<intervals.length-1; i++) {
            if(intervals[i][1] > intervals[i+1][0]) return false;
        }
        return true;
    }
}
