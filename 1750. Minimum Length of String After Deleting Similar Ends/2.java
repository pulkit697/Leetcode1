class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        int i = 0, j = n-1;
        while(i<j && s.charAt(i) == s.charAt(j)) {
            char c = s.charAt(i);
            while(i<=j && s.charAt(i) == c) 
                i++;
            while(i<=j && s.charAt(j) == c)
                j--;
        }
        return j-i+1;
    }
}
