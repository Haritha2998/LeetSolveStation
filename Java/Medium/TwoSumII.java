class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i =0, j =0; 
        while(i < numbers.length) {
            int diff = target - numbers[i];
            j=i+1;
            if(diff > numbers[i]) {
                 while(j < numbers.length && numbers[j] != diff) {
                j++;
            }
            }
           if(j < numbers.length && numbers[j] == diff) return new int[]{i+1, j+1};
           i++;
        }
        return new int[]{i+1, j+1};
    }
}
