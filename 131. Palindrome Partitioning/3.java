class Solution {
    private List<List<String>> ans = new ArrayList<>();
    private boolean isPalindrome(String s, int i, int j) {
        if (i>=j)   return true;
        if (s.charAt(i) != s.charAt(j))   return false;
        return isPalindrome(s, i+1, j-1);
    }
    private void fun(String s, ArrayList<String> temp) {
        if (s.length() == 0) {
            ans.add(new ArrayList(temp));
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(0, i+1));
            if (isPalindrome(s, 0, i)) {
                System.out.println(s.substring(0, i+1) + " ::");
                temp.add(s.substring(0, i+1));
                fun(s.substring(i+1), temp);
                temp.remove(temp.size() - 1);
            }
        }
        return;
    }
    public List<List<String>> partition(String s) {
        fun(s, new ArrayList<String>());
        return ans;
    }
}
