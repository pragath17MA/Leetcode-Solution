class Solution {
    public int minPartitions(String n) {
       int s=0;
       for(int i=0;i<n.length();i++)
       {
        s=Math.max(s,n.charAt(i)-'0');
       }
       return s;
        
    }
}