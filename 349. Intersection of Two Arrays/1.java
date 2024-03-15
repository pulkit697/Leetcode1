class Solution {
    public int[] intersection(int[] a, int[] b) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = a.length, m = b.length;
        int[] arr = new int[1001];
        for(int x: a) {
            arr[x] = 1;
        }
        for(int x: b) {
            if (arr[x] == 1)
                arr[x] = 2;
        }
        for (int i=0;i<1001; i++) {
            if ( arr[i] == 2)    ans.add(i);
        }
        int[] ar = new int[ans.size()];
        int i = 0;
        for (int x: ans) {
            ar[i++] = x;
        }
        return ar;
    }
}
