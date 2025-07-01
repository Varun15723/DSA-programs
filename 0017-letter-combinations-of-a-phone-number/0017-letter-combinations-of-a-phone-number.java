class Solution {
    private static final String[] map = {
        "",     
        "",     
        "abc",  
        "def",  
        "ghi",  
        "jkl",  
        "mno",  
        "pqrs", 
        "tuv",  
        "wxyz"  
    };

    public void helper(String digits, List<String> ans, String curr, int index) {
        if (index == digits.length()) {
            ans.add(curr);
            return;
        }

        String s = map[digits.charAt(index) - '0'];
        for (int i = 0; i < s.length(); i++) {
            helper(digits, ans, curr + s.charAt(i), index + 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) return ans;
        helper(digits, ans, "", 0);
        return ans;
    }
}
