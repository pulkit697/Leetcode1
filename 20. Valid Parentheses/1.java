class Solution {
    private boolean isOpening(char c) {
        return c == '{' || c=='(' || c=='[';
    }
    private boolean isMatching(char a, char b) {
        if(a == ']')    return b=='[';
        if(a == ')')    return b=='(';
        return b=='{';  
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for ( int i = 0; i<s.length(); i++) {
            if (isOpening(s.charAt(i))) st.push(s.charAt(i));
            else {
                if (!st.empty() && isMatching(s.charAt(i), st.peek())) {
                    st.pop();
                }
                else    return false;
            }
        }
        return st.empty();
    }
}
