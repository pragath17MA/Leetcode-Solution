class Solution {
    public int[] countOppositeParity(int[] nums) {
        int o=0;
        int e=0;
        int arr[]=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]%2==0)
            {
                e++;
                arr[i]=o;
            }
            else
            {
                o++;
                arr[i]=e;
            }
        }
            return arr;
        
    }
}