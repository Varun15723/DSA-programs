class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        Arrays.fill(ans,-1);
        for(int i=0;i<nums1.length;i++){
            int fn=-1;
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j]){
                    fn=j;
                    break;
                }

            }
            for(int k=fn+1;k<nums2.length;k++){
                if(nums1[i]<nums2[k]){
                    ans[i]=nums2[k];
                    break;
                }
            }
        }
        return ans;
    }
}