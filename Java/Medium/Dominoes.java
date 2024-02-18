class Solution {
    public String pushDominoes(String dominoes) {
        int i = 0;
        StringBuilder str = new StringBuilder(dominoes);
        StringBuilder prev = new StringBuilder("");
        while(!str.toString().equals(prev.toString())) {
            prev = new StringBuilder(str.toString());
            i=0;
            dominoes = str.toString();
             while(i< dominoes.length()) {
            if(dominoes.charAt(i) == 'L') {
                if( i > 0 && dominoes.charAt(i-1) == '.') {
                    if (i-2 >= 0 && dominoes.charAt(i-2) == 'R') {
                        i++;
                        continue; }
                    str.setCharAt(i-1, 'L');
                }
            } 
            if(dominoes.charAt(i) == 'R') {
                if( i < dominoes.length()-1 && dominoes.charAt(i+1) == '.') {
                    if (i+2 < dominoes.length() && dominoes.charAt(i+2) == 'L') {
                        i++;
                        continue;
                    }
                    str.setCharAt(i+1, 'R');
                    i++;
                }
            }
            i++;

        }
        }
       
        return str.toString();
    }
}
