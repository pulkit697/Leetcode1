class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int n1 = nums1.length, n2 = nums2.length;
        while (i<n1 && j<n2) {
            if (nums1[i] == nums2[j])   return nums1[i];
            else if (nums1[i] < nums2[j])   i++;
            else    j++;
        }
        return -1;
    }
}
