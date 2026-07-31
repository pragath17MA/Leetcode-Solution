class Solution {
    public int maxVowels(String s, int k) {
        char ch[]=s.toCharArray();
        int m=0;
        int c=0;
        for(int i=0;i<k;i++)
        {
            if(val(ch[i]))
            {
                c++;
            }
        }
        m=c;
        for(int i=k;i<ch.length;i++)
        {
            char p=ch[i-k];
            char v=ch[i];
            if(val(p))
            {
                c-=1;
            }
            if(val(v))
            {
                c++;
            }
            m=Math.max(m,c);
        }
        return m;
    }
    public boolean val(char c)
    {
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}