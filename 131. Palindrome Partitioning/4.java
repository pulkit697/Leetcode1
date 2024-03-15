class Solution {
    private List<List<String>> ans = new ArrayList<>();
    int[][] dp = new int[17][17];
    private boolean isPalindrome(String s, int i, int j) {
        if (i>=j)   return true;
        if (s.charAt(i) != s.charAt(j))   return false;
        return isPalindrome(s, i+1, j-1);
    }
    private void fun(String s, int index, ArrayList<String> temp) {
        if (s.length() == index) {
            ans.add(new ArrayList(temp));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            // System.out.println(s.substring(0, i+1));
            if (dp[index][i] == -1) dp[index][i] = isPalindrome(s,index,i) ? 1 : 0;
            if (dp[index][i] == 1) {
                // System.out.println(s.substring(0, i+1) + " ::");
                temp.add(s.substring(index, i+1));
                fun(s, i+1, temp);
                temp.remove(temp.size() - 1);
            }
        }
        return;
    }
    public List<List<String>> partition(String s) {
        for (int i = 0;i<17;i++) {
            for (int j = 0; j<17; j++)
                dp[i][j] = -1;
        }
        fun(s, 0, new ArrayList<String>());
        return ans;
    }
}
