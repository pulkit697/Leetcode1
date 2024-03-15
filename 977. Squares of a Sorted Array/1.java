class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        for ( int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        int[] ans = new int[n];
        for ( int i = 0; i < nums.length; i++) {
            ans[i] = nums[i]*nums[i];
        }
        return ans;
    }
}
