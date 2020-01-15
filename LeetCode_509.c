int fib(int N){
    int fib[31] = { 0,1 };
	for (int i = 2; i <= N; i++)
		fib[i] = fib[i - 1] + fib[i - 2];
    return fib[N];
}
