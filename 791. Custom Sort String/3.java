class Solution {
    public String customSortString(String order, String s) {
        int[] count = new int[26];
        for (int i = 0; i<s.length(); i++) {
            count[(int)s.charAt(i) - (int)'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<order.length(); i++) {
            int x = (int)order.charAt(i) - (int)'a';
            while (count[x] > 0) {
                sb.append(order.charAt(i));
                count[x]--;
            }
        }
        for (int i=0; i<26; i++) {
            while (count[i] > 0) {
                sb.append((char)((int)'a' + i));
                count[i]--;
            }
        }
        return sb.toString();
    }
}
