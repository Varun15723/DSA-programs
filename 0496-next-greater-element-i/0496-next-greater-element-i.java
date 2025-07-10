class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[nums1.length];
        HashMap<Integer,Integer> greater = new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            int current = nums2[i];
            while(!st.isEmpty()&&st.peek()<=current){
                st.pop();
            }
            if(st.isEmpty()){
                 greater.put(current,-1);
            }else{
                greater.put(current,st.peek());
            }
            st.push(current);
        }
        for(int i =0;i<nums1.length;i++){
            ans[i] = greater.get(nums1[i]);
        }
        return ans;
    }
}