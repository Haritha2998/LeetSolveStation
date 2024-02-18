class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] splitted = s.split(" ");
        if (pattern.length() != splitted.length) return false;
        for (int i =0; i< splitted.length; i++) {
            if(map.containsKey(pattern.charAt(i)) && !map.get(pattern.charAt(i)).equals(splitted[i])) return false;
            else {
                if (!map.containsKey(pattern.charAt(i)) && map.containsValue(splitted[i])) return false;
                if (!map.containsKey(pattern.charAt(i))) {
                    map.put(pattern.charAt(i), splitted[i]);
                }
            }
        }
        return true;
    }
}
