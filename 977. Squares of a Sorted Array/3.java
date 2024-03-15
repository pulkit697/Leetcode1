class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0, j = n-1;
        int k = n;
        int[] ans = new int[n];
        while (k-- > 0) {
            int x = Math.abs(nums[i]);
            int y = Math.abs(nums[j]);
            if (x>y){    
                ans[k] = x*x;
                i++;
            }
            else{
                ans[k] = y*y;
                j--;
            }
        }
        return ans;
    }
}
