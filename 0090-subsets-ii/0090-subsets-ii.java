class Solution {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums);  
    pow(nums, 0, new ArrayList<>(), ans);
    return ans;
  }

  private void pow(int[] nums, int s, List<Integer> path, List<List<Integer>> ans) {
    ans.add(new ArrayList<>(path));
    for (int i = s; i < nums.length; ++i) {
      if (i > s && nums[i] == nums[i - 1]) continue;  
      path.add(nums[i]);
      pow(nums, i + 1, path, ans);
      path.remove(path.size() - 1);
    }
  }
}