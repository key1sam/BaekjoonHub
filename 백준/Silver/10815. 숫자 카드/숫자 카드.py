import sys
input = sys.stdin.readline

N = map(int, input())
array1 = set(map(int, input().split()))

M = map(int, input())
array2 = map(int, input().split())

for i in array2 :
    if i in array1 :
        print(1, end = ' ')
    else :
        print(0, end = ' ')


