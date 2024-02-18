class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n= num.length-1;
        int carryOver = k;
        List<Integer> list = new ArrayList<>();
        while(n>=0) {
            int sum =(num[n]+carryOver)%10;
            carryOver = (num[n]+carryOver)/10;
            list.addFirst(sum);
            n--;
        }
        while(carryOver > 0) {
            list.addFirst(carryOver%10);
            carryOver = carryOver/10;
        }
        return list;
    }
}
