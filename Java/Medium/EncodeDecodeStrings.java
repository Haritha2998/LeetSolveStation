public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String s: strs) {
            str.append(s);
            str.append('$');
        }
        return str.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> str = new ArrayList<>();
        int i = 0;
        while(s.length() > 0) {
            i = s.indexOf('$');
            if(i==0) str.add("");
            else {
                str.add(s.substring(0, i));
            }
            if(s.length() > i) s = s.substring(i+1, s.length());
        }
        return str;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));
