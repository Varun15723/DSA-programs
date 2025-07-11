class Solution {
    public int[] nextGreaterElements(int[] nums) {
       int n=nums.length;
       int[] res=new int[n];
       for(int i=0;i<n;i++){
        res[i]=-1;
        for(int j=1;j<n;j++){
            int in=(i+j)%n;
            if(nums[in]>nums[i]){
                res[i]=nums[in];
                break;
            }
        }
       } 
       return res;
    }
}