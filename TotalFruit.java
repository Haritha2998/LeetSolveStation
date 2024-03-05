class Solution {
    public int totalFruit(int[] fruits) {
        int maxTrees = 0, j=0, fruit1 = -1, fruit2 = -1, trees =0;
        if(fruits.length == 1) return 1;
        for(int i = 0; i< fruits.length; i++) {
            j = i+1;
            fruit1 = fruits[i];
            fruit2 = -1;
            trees = 1;
            boolean flag = true;
            while(flag && j < fruits.length) {
                if(fruits[j] == fruit1) {
                    j++;
                    trees++;
                }
                else {
                    if (fruit2 == -1 || fruit2 == fruits[j]) {
                        fruit2 = fruits[j++];
                        trees++;
                    }
                    else {
                 
                        flag = false;
                    }
                   
                }
            }
            maxTrees = Math.max(maxTrees, trees);
            while(i<fruits.length-1 && fruits[i] == fruits[i+1]) {
                i++;
            }
            
        }
        return maxTrees;
    }
}
