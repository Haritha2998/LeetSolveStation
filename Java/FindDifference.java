class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        for(int num: nums1) {
            s.add(num);
        }
        Set<Integer> t = new HashSet<>();
        for(int num: nums2) {
                t.add(num);
        }
        Set<Integer> st = new HashSet<>(s);
        st.removeAll(t);
        t.removeAll(s);
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(st));
        list.add(new ArrayList<>(t));
        return list;
    }
}
