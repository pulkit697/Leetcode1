class Solution {
    private List<List<String>> ans = new ArrayList<>();
    int[][] dp = new int[17][17];
    private boolean isPalindrome(String s, int i, int j) {
        if (i>=j)   return true;
        if (s.charAt(i) != s.charAt(j))   return false;
        return isPalindrome(s, i+1, j-1);
    }
    private void fun(String s, int j, int i, ArrayList<String> temp) {
        if (i == s.length()) {
            if (j == i)
                ans.add(new ArrayList(temp));
            return;
        }
        if (isPalindrome(s, j, i)) {
            temp.add(s.substring(j,i+1));
            fun(s, i+1, i+1, temp);
            temp.remove(temp.size() - 1);
        }
        fun(s, j, i+1, temp);
        return;
    }
    public List<List<String>> partition(String s) {
        for (int i = 0;i < 17; i++) {
            for (int j = 0; j<17; j++) {
                dp[i][j] = -1;
            }
        }
        fun(s, 0, 0, new ArrayList<String>());
        return ans;
    }
}
