class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] count = new int[101];
        int mx = 0;
        int ans = 0;
        for (int x : nums) {
            count[x]++;
            if (count[x] > mx) {
                mx = count[x];
                ans = 1;
            } else if (count[x] == mx) {
                ans++;
            }
        }
        return ans*mx;
    }
}
