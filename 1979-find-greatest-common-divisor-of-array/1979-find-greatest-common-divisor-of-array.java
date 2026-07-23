class Solution {
    public int findGCD(int[] arr) {
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        int min=arr[0];
        int val=1;
        for(int i=min;i>=1;i--)
        {
            if(min%i==0&&max%i==0){
                val=i;
                break;
            }
        }
        return val;
        
    }
}