class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> maps_t = new HashMap<>();
        boolean[] visited = new boolean[128];
        for (int i =0; i< s.length(); i++) {
            if (maps_t.containsKey(s.charAt(i))) {
                if(maps_t.get(s.charAt(i)) != t.charAt(i)) return false;
            }
            else {
                if (visited[t.charAt(i)]) return false;
                else {
            maps_t.put(s.charAt(i), t.charAt(i));
            visited[t.charAt(i)] = true;
                }
            }         
        }
        return true;
    }
}
