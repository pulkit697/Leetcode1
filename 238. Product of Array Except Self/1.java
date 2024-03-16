class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int p = 1;
        for ( int i=0; i<n; i++) {
            ans[i] = p;
            p = p*nums[i];
        }
        p = nums[n-1];
        for (int i=n-2; i>=0; i--) {
            ans[i] = ans[i]*p;
            p = p*nums[i];
        }
        return ans;
    }
}
