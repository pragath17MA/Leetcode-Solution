class Solution {
    public int[] diStringMatch(String s) {
        int I=0;
        int d=s.length();
        int arr[]=new int[s.length()+1];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='I')
            {
                arr[i]=I;
                I++;
            }
            else
            {
                arr[i]=d;
                d--;
            }

        }
        if(s.charAt(s.length()-1)=='I')
        {
        arr[arr.length-1]=I;
    }
    else
    {
        arr[arr.length-1]=d;
    }
    return arr;
    }
}