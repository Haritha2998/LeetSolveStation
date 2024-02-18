package Java;

import java.util.Arrays;

public class isSubSequence {
   
    public boolean isSubsequence(String s, String t) {
        char[] sToArray = s.toCharArray();
        char[] tToArray = t.toCharArray();
        int len = s.length();
        char[] newArr = new char[len];
        int j =0;
        for(int i = 0; i< len; i++) {
            boolean flag = true;
            while(flag && j < t.length()) {
                if(sToArray[i] == tToArray[j]) {
                    newArr[i] = sToArray[i];
                    flag = false;
                    j++;
                }
                else{
                    j++;
                }
            }
        }
        
        return Arrays.equals(sToArray, newArr);
    }
}
