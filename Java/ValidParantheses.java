class Solution {
    public boolean isValid(String s) {
       LinkedList<Character> l = new LinkedList<>();
       HashMap<Character, Character> map = new HashMap<>();
       map.put(')', '(');
       map.put('}', '{');
       map.put(']', '[');
       for (int i =0; i<s.length(); i++) {
           if (map.containsKey(s.charAt(i))) {
               if(l.size() == 0 || l.removeLast() != map.get(s.charAt(i))) return false;
           }
           else{
               l.add(s.charAt(i));
           }
       }
       return l.size() == 0;
    }
}
