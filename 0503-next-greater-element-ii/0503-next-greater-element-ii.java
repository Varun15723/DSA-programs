import java.util.Arrays;
public class Solution {
   
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int[] stack = new int[n];
        int top = -1;

        int i = n-1;
        while(i>=0){
            while(top!=-1 && stack[top]<=arr[i])
                top--;
            stack[++top] = arr[i];
            i--;
        }

        int j = n-1;
        while(j>=0){
            while(top!=-1 && stack[top]<=arr[j])
                top--;
            if(top==-1)
                result[j] = -1;
            else
                result[j] = stack[top];
            stack[++top] = arr[j];
            j--;
        }
        return result;
    }
}