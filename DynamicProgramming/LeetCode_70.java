/* Solving the DP problem by using recursive with cache*/
class Solution {
    public int climbStairs(int n) {
        int[] cache=new int[n+1];
        for(int item:cache)
            item=0;
        if(n>=1)cache[1]=1;
        if(n>=2)cache[2]=2;
        if(n>=3)cache[3]=3;
        return dp(n,cache);
    }
    private int dp(int n,int[] cache){
        if(cache[n]!=0);
        else cache[n]=dp(n-1,cache)+dp(n-2,cache);
        return cache[n];
    }
}
/*Solving the DP problem by using iteration*/
class Solution {
    public int climbStairs(int n) {
        int pre=1;
        int cur=2;
        int res=0;
        if(n==1) return pre;
        else if(n==2) return cur;
        else
            for(int i=3;i<=n;i++){
                res=pre+cur;
                pre=cur;
                cur=res;
            }
            return res;
    }
}
