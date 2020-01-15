/*A better approach is exist*/
int maxScoreSightseeingPair(int* A, int ASize){
    int Max=*A+*(A+1)-1;
    for(int i=0;i<ASize;i++)
        for(int j=i+1;j<ASize;j++){
            if (A[i] + A[j]+i-j <0) break;
            Max=(Max<(*(A+i)+*(A+j)+i-j))?(*(A+i)+*(A+j)+i-j):Max;
        }
    return Max;
}
