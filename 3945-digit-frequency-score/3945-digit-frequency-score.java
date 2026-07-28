class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer>map=new HashMap<>();
        while(n>0)
        {
            int v=n%10;
            map.put(v,map.getOrDefault(v,0)+1);
            n=n/10;
        }
        int s=0;
        for(int i:map.keySet())
        {
            s+=map.get(i)*i;
        }
        return s;
    }
}