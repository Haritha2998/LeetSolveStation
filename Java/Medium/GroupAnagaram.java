class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i< strs.length; i++) {
            char[] a = strs[i].toCharArray();
            Arrays.sort(a);
            String s = new String(a);
            if(map.containsKey(s)) {
                map.get(s).add(strs[i]);
            }
            else {
                List<String> l = new ArrayList<>();
                l.add(strs[i]);
                map.put(s, l);
            }
        } 

        return new ArrayList<>(map.values());
    }
}
