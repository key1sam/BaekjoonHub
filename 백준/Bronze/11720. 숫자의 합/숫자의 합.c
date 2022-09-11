#include <stdio.h>
#include <string.h>

int main() {
    int n, result;
    scanf("%d", &n);
    result = 0;
    getchar();
    for (int i = 0; i < n; i++)
        result = result + getchar() - '0';
    printf("%d\n", result);
    return 0;
}
