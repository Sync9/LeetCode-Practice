class Solution {
  public int waysToStep(int n){
      long[] memo=new long[4];
        if(n>=1) memo[0]=1;
        if(n>=2) memo[1]=2;
        if(n>=3) memo[2]=4;
        if(n<=3) return (int)memo[n-1];
        else{
            for(int i=4;i<=n;i++) {
                memo[3] = (memo[0]+memo[1]+memo[2])%1000000007;
                memo[0]=memo[1];
                memo[1]=memo[2];
                memo[2]=memo[3];
            }
            return (int)memo[3];
        }
    }
}
