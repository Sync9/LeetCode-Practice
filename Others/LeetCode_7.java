class Solution {
    public int reverse(int x) {
        int res=0;
        int[] arr=new int[32];
        int digit=0;
        int key=0;
        boolean sign=x<0;
        for(int i=0;i<arr.length;i++) arr[i]=11;
        for(int i=0;i<arr.length;i++){
            if(digit!=0&&x==0) {
                key=i-1;
                break;
            }
            digit=x%10;
            digit=(digit<0)?-digit:digit;
            arr[i]=digit;
            x/=10;
        }
        for(int i=key,j=0;i>=0;i--,j++){
            res+=(int)arr[i]*Math.pow(10,j);
        }
        if(!sign)res=res>(int)Math.pow(2,31)-1?0:res;
        else res=res>=(int)Math.pow(2,31)?0:res;
        return sign?-res:res;
    }
}
