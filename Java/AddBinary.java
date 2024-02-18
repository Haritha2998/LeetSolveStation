import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger c = new BigInteger(a, 2);
        BigInteger d = new BigInteger(b, 2);
        BigInteger zero = new BigInteger("0", 2);
        BigInteger carry, answer;
        while(d.compareTo(zero) != 0) {
            answer = c.xor(d);
            carry = c.and(d).shiftLeft(1);
            c=answer;
            d=carry;
        }
        return c.toString(2);
    }
}
