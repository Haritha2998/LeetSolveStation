class Solution {
    public int[] replaceElements(int[] arr) {
        int i = 0;
        while(i<arr.length) {
            if (i == arr.length -1) {
                arr[i++] = -1;
            }
            else {
            int j = i+1;
            int maxIndex = 0;
            int max = 0;
            while(j< arr.length) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
                j++;
            }
            arr[i++] = arr[maxIndex];

            while(i < maxIndex) {
                arr[i++] = arr[maxIndex];

            }
        }
        }
        return arr;
    }
}