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
/*Solving the DP problem by using State transition equation*/
