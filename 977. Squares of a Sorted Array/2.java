class Solution {
    int bs(int[] arr, int i, int j) {
        if (i > j)  return Integer.MAX_VALUE;
        if (arr[j] < 0)    return j+1;
        int mid = (i+j+1)/2;
        if (arr[mid] >= 0) return Math.min(mid, bs(arr, i, j-1));
        return bs(arr, i+1, j);
    }
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int k = bs(nums, 0, n-1);
        int i = k-1, j = k;
        k = 0;
        int[] ans = new int[n];
        while (i>=0 && j<n) {
            int x = Math.abs(nums[i]);
            // System.out.println(i + ":" + x + "   " + j + ":" + nums[j]);
            if (x < nums[j]){   
                ans[k++] = x*x;
                i--;
            }
            else    ans[k++] = nums[j]*nums[j++];
        }
        while (i>=0) {
            int x = Math.abs(nums[i--]);
            ans[k++] = x*x;
        }
        while (j<n) {
            ans[k++] = nums[j]*nums[j++];
        }
        return ans;
    }
}
