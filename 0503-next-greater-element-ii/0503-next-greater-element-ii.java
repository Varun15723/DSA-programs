import java.util.*;
public class Solution {
   
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
       int [] ans=new int[n];
       Stack<Integer> s=new Stack<>();
       for(int i=2*n-1;i>=0;i--){
        int in=i%n;
        int curr=nums[in];
        while(!s.isEmpty() && s.peek() <=curr){
            s.pop();        
        }
        if(i<n){
            if(s.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=s.peek();
            }
           
        }
        s.push(curr);
       }
       return ans;
    }
}