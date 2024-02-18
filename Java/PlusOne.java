class Solution {
    public int[] plusOne(int[] digits) {
        int carryOver = 1;
        for(int i = digits.length-1; i>= 0; i--) {
            if(digits[i]+carryOver > 9) {
                digits[i] = 0;
                carryOver = 1;
            }
            else{
                digits[i] += carryOver;
                carryOver =0;
                break;
            }
        }
        if(carryOver == 1) {
            int[] dig = new int[digits.length+1];
            dig[0] =1;
            digits = dig;
        }
    return digits;
    }
}
