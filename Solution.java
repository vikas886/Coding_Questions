public class Solution {
    public int solve(String A, String B) {
        int[] hash_a=new int[26];//hash map for A
        int[] hash_b=new int[26];//hash map for B
        int m=A.length();//length of A
        int n=B.length();//length of B
        int ans=0;//initialize ans =0
        // count frequency of each char in A and B for 1st windiow
        //we are iterating over length of A coz its permutation have to be find 
        for(int i=0;i<m;i++){
            hash_a[A.charAt(i)-'a']++;
            hash_b[B.charAt(i)-'a']++;
        }
        boolean flag=true;
        //we are checking for 1st window if it's the permuation or not
        for(int i=0;i<25;i++){
            if(hash_a[i]==hash_b[i]){
               continue; 
            }else{
                flag=false;
                break;
            }
        }
        if(flag==true){
            ans++;
        }
        for(int j=1;j<=n-m;j++){
            hash_b[B.charAt(j-1)-'a']--;//moving window 
            hash_b[B.charAt(j+m-1)-'a']++;
            flag=true;
            for(int i=0;i<25;i++){//checking for the permutation 
                if(hash_a[i]==hash_b[i]){
                    continue; 
                }else{
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                ans++;
            }
        }
        return ans;
    }
}
