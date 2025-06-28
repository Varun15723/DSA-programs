class Solution {
    public void power(int index,int[] nums, List<Integer> cur, List<List<Integer>> ans) {
            ans.add(new ArrayList<>(cur));
            for(int i=index;i<nums.length;i++){
                if(i>index&&nums[i]==nums[i-1])continue;
                cur.add(nums[i]);
                power(i+1, nums, cur, ans);
                cur.remove(cur.size() - 1);
        } 
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(nums);
        power(0, nums, cur, ans);
        return ans;
    
    }
}