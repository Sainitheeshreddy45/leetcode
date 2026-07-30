class Solution {
    public void moveZeroes(int[] nums) {
        int temp = -1;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0) {
                temp = i;
                break;
            }
        }
        if(temp < 0) {
            return;
        }
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != 0 && i > temp) {
                nums[temp] = nums[i];
                nums[i] = 0;
                temp++;
            }
        }
    }
}