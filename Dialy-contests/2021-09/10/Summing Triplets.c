#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    int t;
    scanf("%d", &t);
    for (int i = 0; i < t; i++)
    {
        long long int a, b, c, sum = 0;
        scanf("%lld%lld%lld", &a, &b, &c);
        sum = a + b + c;
        printf("%lld\n", sum);
    }

    return 0;
}