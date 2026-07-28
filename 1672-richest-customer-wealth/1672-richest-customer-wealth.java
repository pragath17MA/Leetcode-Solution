class Solution {
    public int maximumWealth(int[][] arr) {
        int m=0;
        for(int i=0;i<arr.length;i++)
        {
            int s=0;
            {
                for(int j=0;j<arr[i].length;j++)
                {
                    s+=arr[i][j];
                }
                m=Math.max(s,m);
            }
        }
        return m;
    }
}