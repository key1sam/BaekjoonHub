import sys
input = sys.stdin.readline

N, M = map(int, input().split())
array1 = list(map(int, input().split()))
array2 = [0] * N # 합배열
array3 = [0] * M # 각 인덱스만큼의 나머지를 Count를 해놓은 리스트 

remainder = 0

sum = 0
ans = 0

array2[0] = array1[0]

for i in range(1, N) :
    sum = array2[i-1] + array1[i]
    array2[i] = sum

for i in range(N):
    remainder = array2[i] % M
    if remainder == 0 :
        ans += 1
    array3[remainder] += 1

for i in range(M) :
    if array3[i] > 1:
        ans += (array3[i] * (array3[i] - 1) // 2) # Combination으로 2개를 선택하는 경우의 수
print(ans)
