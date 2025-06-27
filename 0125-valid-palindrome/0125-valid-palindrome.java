class Solution {
    public boolean validpalindrome(int left,int right,String s){
        if(left>=right) return true;
        if(s.charAt(left)!=s.charAt(right)) return false;
        return validpalindrome(left+1,right-1,s);
    }
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        return validpalindrome(0,s.length()-1,s);
        
    }
}