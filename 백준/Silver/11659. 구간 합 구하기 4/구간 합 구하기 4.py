import sys
input = sys.stdin.readline

N, M = map(int, input().split())
array1 = list(map(int, input().split()))
array2 = [0] * N # 합 배열

array2[0] = array1[0]
array2[1] = array1[0] + array1[1]

for k in range(1, N) :
    array2[k] = array2[k-1] + array1[k]

for _ in range(M) :
    a, b = map(int, input().split())
    if a == 1 :
        print(array2[b-1])
    else :
        print(array2[b-1] - array2[a-2])
