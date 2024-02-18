class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum =0;
        int total =0;
        for(String s: operations) {
            if(Character.isDigit(s.charAt(0)) || s.charAt(0) == '-') {
                sum = Integer.parseInt(s);
                stack.push(sum);
                total += sum;
            }
            else if(s.equals("+")) {
                int i = stack.pop();
                int j = stack.pop();
                sum = i+j;
                stack.push(j);
                stack.push(i);
                stack.push(sum);
                total += sum; 
            }
            else if(s.equals("C")) {
                sum= stack.pop();
                total -= sum;
            }
            else {
                total += 2 * stack.peek();
                stack.push(2 * stack.peek());
                
            }
        }
        return total;
    }
}
