class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n=nums.length;
        int m=Math.abs(nums[0]-nums[n-1]);
        for(int i=0;i<n-1;i++)
        {
            m=Math.max(Math.abs(nums[i]-nums[i+1]),m);
        }
       return m;
    }
}