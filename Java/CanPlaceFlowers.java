class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int j=0;
        if (n==0) return true;
        if (flowerbed.length == 1 && flowerbed[0] == 0) {
            return n<2; 
        } 
        while(j < flowerbed.length) {
            if (flowerbed[j] == 0) {
                if (j==0) {
                    if (flowerbed[j+1] == 0) {
                         n--;
                        flowerbed[j] = 1;
                    }
                }
                else if (j == flowerbed.length -1) {
                    if (flowerbed[j-1] == 0) {
                         n--;
                        flowerbed[j] = 1;
                    }
                }
                else {
                    if(flowerbed[j-1] == 0 && flowerbed[j+1] == 0){
                     n--;
                        flowerbed[j] = 1;
                    }
            }
            }
            if (n == 0) return true;
            j = j+1;
        }
        return false;
    }
}
