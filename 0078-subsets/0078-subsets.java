import java.util.*;

class Solution {
    public void power(int index, int[] nums, List<Integer> cur, List<List<Integer>> ans) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        
        power(index + 1, nums, cur, ans);
        cur.add(nums[index]);
        power(index + 1, nums, cur, ans);
        cur.remove(cur.size() - 1); 
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        power(0, nums, cur, ans);
        return ans;
    }
}
