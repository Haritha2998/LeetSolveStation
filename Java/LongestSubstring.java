class Solution {
    public String longestCommonPrefix(String[] strs) {
    String s = new String(strs[0]);
    int len = strs.length;
    if (len == 0) return "";
    if (len == 1) return strs[0];
    for(int j =1; j< strs.length; j++) {
        String temp = s;
        s = "";
        int i =0;
        while (i < temp.length() && i < strs[j].length()){
            if(strs[j].charAt(i) == temp.charAt(i)) {
               s = s + strs[j].charAt(i);
            }
            else {
                if (s.length() == 0) {
                return  s;
            }
                break;
            }
            
            i++;
        }
    }
    return s;
    }
}


class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 0) return "";
        if (len == 1) return strs[0];
        String prefix = strs[0];
        for (int i = 1; i< len; i++) {
            while (strs[i].indexOf(prefix) != 0)
            {
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix == "") return prefix;
            }
        }
        return prefix;
    }
}
