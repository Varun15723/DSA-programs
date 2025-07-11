import java.util.*;
public class Solution {

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1); 
        Stack<Integer> s = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int in = i % n;
            while (!s.isEmpty() && nums[in] >= s.peek()) {
                s.pop();
            }
            if (!s.isEmpty()) {
                ans[in] = s.peek();
            }
            s.push(nums[in]);
        }
        return ans;
    }
}