class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count =0;
        if(arr.length < k) return count;
        int avg =0;
        for(int i =0; i< arr.length; i++) {
                if(i-k >= 0) {
                    avg = avg - arr[i-k] + arr[i];
                    
                }
                else {
                    avg += arr[i];
                }
                if (i >= k-1  && (avg >= threshold * k)) count++;
            }
        return count;
    }
}
