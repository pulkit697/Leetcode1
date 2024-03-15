class Solution {
    public int[] intersection(int[] a, int[] b) {
        int n = a.length, m = b.length;
        int[] arr = new int[1001];
        int k = 0;
        for(int x: a) {
            arr[x] = 1;
        }
        for(int x: b) {
            if (arr[x] == 1) {
                arr[x] = 2;
                k++;
            }
        }
        int[] ans = new int[k];
        k = 0;
        for (int i=0;i<1001; i++) {
            if ( arr[i] == 2){
                ans[k++] = i;
            }
        }
        return ans;
    }
}
