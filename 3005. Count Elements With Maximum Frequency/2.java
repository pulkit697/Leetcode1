class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] count = new int[101];
        int mx = 0;
        for (int x : nums) {
            count[x]++;
            if (count[x] > mx)
                mx = count[x];
        }
        int ans = 0;
        for (int c : count) {
            if (c == mx)    ans++;
        }
        return ans*mx;
    }
}
