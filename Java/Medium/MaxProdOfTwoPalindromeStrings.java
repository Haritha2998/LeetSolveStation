class Solution {
    public int maxProduct(String s) {
        int length = (1 << s.length())-1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int seq=0; seq<=length; seq++) {
            String subSeq = "";
            for(int i = 0; i<s.length(); i++) {
                if((seq & (1 << i)) != 0) subSeq += String.valueOf(s.charAt(i));
            }
            StringBuilder reversed = new StringBuilder(subSeq).reverse();
            if(subSeq.equals(reversed.toString())) map.put(seq, subSeq.length());
        }
        int maxProd = 0;
        for(Map.Entry<Integer, Integer> entry1 : map.entrySet()) {
            for(Map.Entry<Integer, Integer> entry2 : map.entrySet()) {
                if((entry1.getKey() & entry2.getKey()) == 0) {
                    maxProd = Math.max(maxProd, entry1.getValue() * entry2.getValue());
                }
            }
        }
        return maxProd;
    }
}
