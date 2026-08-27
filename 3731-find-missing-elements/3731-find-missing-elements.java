class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        /*int n=nums.length+1;
        int s=n*(n+1)/2;
        int as=0;
        for(int i=0;i<nums.length;i++)
        {
            as+=nums[i];
        }
        int m=s-as;*/
        ArrayList<Integer>list=new ArrayList<>();
        Arrays.sort(nums);
        int s=nums[0];
        int e=nums[nums.length-1];
        for(int i=s;i<=e;i++)
        {
            int c=0;
            for(int j=0;j<nums.length;j++)
            {
                if(i==nums[j])
                {
                    c++;
                    break;
                }
            }
            if(c==0)
            {
                list.add(i);
            }
        }
        return list;

    }
}