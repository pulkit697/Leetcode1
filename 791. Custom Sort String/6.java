class Solution {
    public String customSortString(String order, String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray()) {
            count[c]++;
        }
        StringBuilder sb = new StringBuilder();
        for (char c: order.toCharArray())
            while (count[c]-- > 0)
                sb.append(c);

        for (char c='a'; c<='z'; c++) {
            while (count[c]-- > 0) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
