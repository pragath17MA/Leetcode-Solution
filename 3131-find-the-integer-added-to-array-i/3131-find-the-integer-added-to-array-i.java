class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int a=nums1[0];
        int b=nums2[0];
        for(int i=0;i<nums1.length;i++)
        {
            a=Math.min(a,nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            b=Math.min(b,nums2[i]);
        }
        return b-a;
    }
}