
class Solution {
    private class CustomComparator implements Comparator<String> {
    public int compare (String a, String b) {
        String first = b+a;
        String second = a+b;
        return first.compareTo(second);
    }
}
    public String largestNumber(int[] nums) {
        // [2, 202, 345, 10,8, 0] = 82345202100
        String[] numString = new String[nums.length];
        for(int i =0; i< nums.length; i++) {
            numString[i] = String.valueOf(nums[i]);
        }
        StringBuilder str = new StringBuilder();
        Arrays.sort(numString, new CustomComparator());
        if(numString[0].equals("0")) return "0";
        for(int i =0; i< nums.length; i++) {
            str.append(numString[i]);
        }
       
        return str.toString();
    }
}
