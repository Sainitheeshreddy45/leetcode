class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> result = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int diff = target - nums[i];
            if(result.containsKey(diff)) {
                return new int[]{i, result.get(diff)};
            }
            else {
                result.put(nums[i],i);
            }
        }
        return null;
    }
}