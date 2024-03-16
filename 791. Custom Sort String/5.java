class Solution {
    public String customSortString(String order, String s) {
        int[] count = new int[128];
        for (int i = 0; i<s.length(); i++) {
            count[s.charAt(i)]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<order.length(); i++) {
            while (count[order.charAt(i)] > 0) {
                sb.append(order.charAt(i));
                count[order.charAt(i)]--;
            }
        }
        for (char c='a'; c<='z'; c++) {
            while (count[c] > 0) {
                sb.append(c);
                count[c]--;
            }
        }
        return sb.toString();
    }
}
