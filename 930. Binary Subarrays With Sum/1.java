class Solution {
    public int numSubarraysWithSum(int[] arr, int target) {
        int n = arr.length;
        int[] c = new int[n];
        for (int i = 1; i<n; i++) {
            if (arr[i-1] == 0) {
                c[i] = c[i-1]+1;
            }
        }
        // c[i] => number of 0s just before c[i]
        int sum = 0;
        int i = 0, j = 0;
        int ans = 0;
        while (j<n) {
            sum += arr[j];
            while (i<j && (sum > target || arr[i] == 0)) {
                sum -= arr[i++];
            }
            if (sum == target) {
                ans += c[i]+1;
            }
            j++;
        }
        return ans;
    }
}
