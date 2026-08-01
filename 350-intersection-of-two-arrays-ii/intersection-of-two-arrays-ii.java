class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> set1 = new HashMap<>();
        for (int num : nums1) {
            set1.put(num, set1.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> resultSet = new ArrayList<>();
        for (int num : nums2) {
            if (set1.containsKey(num)) {
                if(set1.get(num)>0) {
                    resultSet.add(num);
                    set1.put(num, set1.get(num) - 1);
                }
            }
        }
        
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) result[i++] = num;
        return result;
    }
}