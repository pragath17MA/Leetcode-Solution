class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        // Add all elements to the set
        for (int i : nums) {
            set.add(i);
        }
        
        // Check from 1 to n using O(1) set lookup
        int n = nums.length;
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }
        
        return list;
    }
}
