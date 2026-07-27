class Solution {
    public int maximumProduct(int[] nums) {
        int v=1;
        /*Arrays.sort(nums);
        int a=nums[nums.length-1];
        int b=nums[nums.length-2];
        int c=nums[nums.length-3];
        int v1=1;
        int d=nums[0];
        int e=nums[1];
        int f=nums[2];
        v=a*b*c;
        v1=d*e*f;
        int m=Math.max(v,v1);
        return v;*/
        Arrays.sort(nums);
        int a=nums[nums.length-1];
        int b=nums[nums.length-2];
        int c=nums[nums.length-3];
        int d=nums[0];
        int e=nums[1];
        v=a*b*c;
        int v1=1;
        v1=d*e*a;
        int m=Math.max(v,v1);
        return m;
    }
}