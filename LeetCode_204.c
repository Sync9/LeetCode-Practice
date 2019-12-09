#include<math.h>
int is_Prime(int m)
{
	if (m == 0 || m == 1)
		return 0;
	if (m == 2 || m == 3)
		return 1;
	if (m % 6 != 1 && m % 6 != 5)
		return 0;
	int temp = sqrt(m);
	for (int j = 5; j <= temp; j+=6)
		if (m % j == 0 || m % (j + 2) == 0)
			return 0;
	return 1;
}
int countPrimes(int n) {
	int count = 0;
	for (int i = 0; i < n; i++)
		if (is_Prime(i) == 1) count++;
	return count;
}
