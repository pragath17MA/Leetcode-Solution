class Solution {
    public int maxProduct(int n) {
        int m=0;
        int v=1;
        String s=Integer.toString(n);
        int arr[]=new int[s.length()];
        for(int i=0;i<arr.length;i++)
        {
           arr[i] = s.charAt(i) - '0';
        }
        Arrays.sort(arr);
        m=arr[arr.length-1]*arr[arr.length-2];
        return m;
        
    }

}