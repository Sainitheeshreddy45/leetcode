class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> res = new HashMap<>();
        for(int i =0;i<nums.length;i++) {
            if(res.containsKey(nums[i])) {
                if (Math.abs(res.get(nums[i])-i) <= k) {
                    return true;
                }
                else {
                    res.put(nums[i], i);
                }
            }
            else {
                res.put(nums[i], i);
            }
        }
        return false;
    }
}