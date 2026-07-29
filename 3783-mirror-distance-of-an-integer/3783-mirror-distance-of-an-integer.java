class Solution {
    public int mirrorDistance(int n) {
        String s=String.valueOf(n);
        int v=0;
        String r="";
        for(int i=s.length()-1;i>=0;i--)
        {
            r+=s.charAt(i);
        }
        int b=Integer.parseInt(r);
        v=Math.abs(n-b);
        return v;
    }
}