class Solution {
    public int maxArea(int[] height) {
        int i =0, j = height.length -1;
        int maxVolume = 0;
        while(i<j) {
            int length = Math.min(height[i], height[j]);
            maxVolume = Math.max(length*(j-i), maxVolume);
            if(length == height[i]) i++;
            else j--;
        }
        return maxVolume; 
    }
}
