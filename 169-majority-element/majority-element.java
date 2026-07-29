class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int majorityELe = nums[0];
        for(int i=1;i<nums.length;i++) {
            if (majorityELe == nums[i]) {
                count++;
            }
            else {
                count--;
            }
            if(count <= 0) {
                majorityELe = nums[i];
                count =1;
            }
        }
        return majorityELe;
    }
}