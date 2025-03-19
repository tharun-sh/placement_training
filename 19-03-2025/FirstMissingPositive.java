class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int op = 1;
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] <= 0) continue;
            if(nums[i] == op) op++;
            else if(nums[i]>op) return op;
        }
        return op;
    }
}
