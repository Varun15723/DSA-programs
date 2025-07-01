class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        gen(1,k,n,res,new ArrayList<>());
        return res;
    }
    public void gen(int num,int k,int n,List<List<Integer>> res,List<Integer> li){
        if(k==0&&n==0){
            res.add(new ArrayList<>(li));
            return;
        }

        if(num>9){
            return;
        }

        li.add(num);
        gen(num+1,k-1,n-num,res,li);
        li.remove(li.size()-1);
        gen(num+1,k,n,res,li);
    }
}