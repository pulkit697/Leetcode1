class Solution {
    public String customSortString(String order, String s) {
        int[] count = new int[128];
        for (int i = 0; i<s.length(); i++) {
            count[(int)s.charAt(i)]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<order.length(); i++) {
            int x = (int)order.charAt(i);
            while (count[x] > 0) {
                sb.append(order.charAt(i));
                count[x]--;
            }
        }
        for (int i=0; i<128; i++) {
            while (count[i] > 0) {
                sb.append((char)i);
                count[i]--;
            }
        }
        return sb.toString();
    }
}
