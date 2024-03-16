class Solution {
    private int bs(int[] nums, int target, int i, int j) {
        if (i>j)    return -1;
        int mid = (i+j)/2;
        if (nums[mid] > target) return Math.max(mid, bs(nums, target, mid+1, j));
        return bs(nums, target, i, mid-1);
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int i, int j) {
        if (i>=j)   return;
        swap(nums,i,j);
        reverse(nums, i+1, j-1);
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if (n == 1) return;
        int k = n-2;
        while (k >= 0 && nums[k]>=nums[k+1]) {
            k--;
        }
        System.out.println(k);
        // nums[k+1] ...  nums[n-1] is sorted in descending order.

        if (k != -1) {        // array is sorted in descending order
            int index = bs(nums, nums[k], k+1, n-1);
            System.out.println(index);
            swap(nums, k, index);
        }
        reverse(nums, k+1, n-1);
    }
}
