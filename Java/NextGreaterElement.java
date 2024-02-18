class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(nums2[nums2.length-1], -1);
        int greatest = nums2[nums2.length-1];
        int temp = 0;
        for (int i = nums2.length - 2; i>= 0; i--) {
            if (greatest > nums2[i]) {
                map.put(nums2[i], greatest);
                greatest = nums2[i];
            }
            else {
                temp = greatest;
                while(temp < nums2[i] && temp != -1) {
                    greatest = temp;
                    temp = map.get(temp);
                }
                map.put(nums2[i], temp);
                greatest = nums2[i];
            }
        }
        int[] arr = new int[nums1.length];
        for (int i =0; i< nums1.length; i++) {
            arr[i] = map.get(nums1[i]);
        }
       return arr;
    }
}
