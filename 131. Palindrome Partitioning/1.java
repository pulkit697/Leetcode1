class Solution {
    private List<List<String>> ans = new ArrayList<>();
    private boolean isPalindrome(String s, int i, int j) {
        if (i>=j)   return true;
        if (s.charAt(i) != s.charAt(j))   return false;
        return isPalindrome(s, i+1, j-1);
    }
    private void fun(String s, int i, ArrayList<String> temp) {
        int n = temp.size();
        String last = temp.get(n-1);
        boolean isPalindrome = isPalindrome(last, 0, last.length()-1);
        System.out.println(last + " : " + isPalindrome);
        if (i == s.length()) {
            System.out.print(isPalindrome + " : ");
            System.out.println(temp);
            if (isPalindrome)
                ans.add(temp);
            return;
        }
        ArrayList<String> temp2 = (ArrayList) temp.clone();
        if (isPalindrome) {
            temp2.add("" + s.charAt(i));
            fun(s, i+1, temp2);
        }
        temp.remove(n-1);
        temp.add(last + s.charAt(i));
        fun(s, i+1, temp);
        return;
    }
    public List<List<String>> partition(String s) {
        fun(s, 1, new ArrayList<String>( Arrays.asList("" + s.charAt(0)) ));
        return ans;
    }
}
