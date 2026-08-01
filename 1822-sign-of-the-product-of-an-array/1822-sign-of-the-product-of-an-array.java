class Solution {
    public int arraySign(int[] nums) {
        int n=0;
        for(int num:nums)
        {
            if(num==0)
            {
                return 0;
            }
            else if(num<0)
            {
                n++;
            }
        }
        return (n%2==1)?-1:1;
        
    }
}