import sys
input = sys.stdin.readline

sum = 0
N = int(input())
array = list(map(int, input().split()))
Max = max(array)

for i in array :
    sum += i / Max*100
print(sum/N)
