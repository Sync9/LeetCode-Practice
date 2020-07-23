/*The problem could be samplified.
 *The one who gets 1 will defeat.
 *When N is an even number,it's Alice controls the contest.
 *She will play optimally then she will finally win the contest.
 *When N is an odd number,it's Bob controls the contest.
 *He will paly optimally then he will finally win the contest.
*/
/*When I don't know that*/
class Solution {
    public boolean divisorGame(int N) {
        int cache[]=new int[N+1];
        for(int item:cache)
            item=0;
        if(N>=1) cache[1]=-1;
        else if(N>=2) cache[2]=1;
        else if(N>=3) cache[3]=-1;
        return dp(N,cache);
    }
    private boolean dp(int N,int[] cache){
        if(cache[N]==0) {
            for (int i = 1;i < N;i++) {
                if(N%i==0&&cache[N]!=1) cache[N]=-sign(dp(N-i,cache));
            }
        }
        return sign(cache[N]);
    }
    private boolean sign(int val){
        if(val>=0) return true;
        else return false;
    }
    private int sign(boolean bool){
        if(bool==true) return 1;
        else return -1;
    }
}
/*When I know that*/
class Solution {
    public boolean divisorGame(int N) {
        return N%2==0;
    }
}
