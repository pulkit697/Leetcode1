class Solution {
    private List<List<String>> ans = new ArrayList<>();
    private boolean isPalindrome(String s, int i, int j) {
        if (i>=j)   return true;
        if (s.charAt(i) != s.charAt(j))   return false;
        return isPalindrome(s, i+1, j-1);
    }
    private void fun(String s, int i, String t, ArrayList<String> temp) {
        if (i == s.length()) {
            if (t == "")
                ans.add(temp);
            return;
        }
        String x = t + s.charAt(i);
        boolean isPalindrome = isPalindrome(x, 0, x.length()-1);
        System.out.println(x + " : " + isPalindrome);

        ArrayList<String> temp2 = (ArrayList) temp.clone();
        if (isPalindrome) {
            temp2.add(x);
            fun(s, i+1, "", temp2);
        }
        fun(s, i+1, x, temp);
        return;
    }
    public List<List<String>> partition(String s) {
        fun(s, 0, "", new ArrayList<String>());
        return ans;
    }
}
