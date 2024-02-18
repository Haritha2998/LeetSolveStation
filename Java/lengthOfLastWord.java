class Solution {
    public int lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        int length = split.length;
        return split[length-1].length();
    }
}


