class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        int i = 0, j = n-1;
        while(i<j) {
            if (s.charAt(i) != s.charAt(j))
                break;
            char c = s.charAt(i);
            while(i<j && s.charAt(i) == c) 
                i++;
            while(j>=i && s.charAt(j) == c)
                j--;
        }
        return j-i+1;
    }
}
