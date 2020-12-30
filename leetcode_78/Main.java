//leetcode 78 subsets
import java.io.*; 
import java.util.*; 
 public class Main {
    public static List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> big=new ArrayList<List<Integer>>();
         subset(nums,0,new ArrayList<Integer>(),big);
        return big;
    }
    public static void subset(int[] nums,int vindx,List<Integer> temp,List<List<Integer>> big){
        if(vindx==nums.length){
            big.add(new ArrayList<Integer>(temp));
            return;
        }
        temp.add(nums[vindx]);
        subset(nums,vindx+1,temp,big);
        temp.remove(temp.size()-1);
        subset(nums,vindx+1,temp,big);
        
    }
    
    public static void main (String[] args) {
        int [] nums={1,2,3};
        List<List<Integer>> big=subsets(nums);
        System.out.println(big);
    }
    
}