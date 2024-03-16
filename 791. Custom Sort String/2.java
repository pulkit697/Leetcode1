class Solution {
    private int ascii(char c) {
        int a = (int)'a';
        return (int) c - a;
    }
    public String customSortString(String order, String s) {
        int[] priority = new int[26];
        int k = 1;
        for (char c: order.toCharArray()) {
            priority[ascii(c)] = priority[ascii(c)] == 0 ? k++ : priority[ascii(c)];
        }
        Character[] str = new Character[s.length()];
        for ( int i = 0; i < s.length(); i++)   str[i] = s.charAt(i);
        Arrays.sort(str, (a,b) -> priority[ascii(a)] - priority[ascii(b)]);
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < s.length(); i++)   sb.append(str[i]);
        return sb.toString();
    }
}
