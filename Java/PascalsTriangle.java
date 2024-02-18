class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> pascal = new ArrayList<>();
       pascal.add(new ArrayList<>(Arrays.asList(1)));
       if(numRows == 1) return pascal;
       for (int i = 1; i< numRows; i++) {
           List<Integer> l1 = new ArrayList<>();
           l1.add(1);
           int j = 1;
           while(j<i) {
               l1.add(pascal.get(i-1).get(j-1) + pascal.get(i-1).get(j));
               j++;
           }
           l1.add(1);
           pascal.add(l1);
       }
        return pascal;
    }
}
