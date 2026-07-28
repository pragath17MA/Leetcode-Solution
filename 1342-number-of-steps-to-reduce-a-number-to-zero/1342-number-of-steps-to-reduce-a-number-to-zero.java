class Solution {
    public int numberOfSteps(int num) {
        int v=num;
        int c=0;
        while(v>0)
        {
            if(v%2==0)
            {
                v=v/2;
                c++;
            }
            else
            {
                v-=1;
                c++;
            }
        }
        return c;
        
    }
}