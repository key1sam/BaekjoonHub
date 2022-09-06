import sys
sys.setrecursionlimit(10**9)
input = sys.stdin.readline
ans = [0]*20000001 # 양수가 저장되는 곳

N = map(int, input())
for i in input().split() :
    i = int(i)
    ans[i] += 1
        
M = map(int, input())
array2 = map(int, input().split())

for i in array2 :
    i = int(i)
    print(ans[i], end = ' ')
