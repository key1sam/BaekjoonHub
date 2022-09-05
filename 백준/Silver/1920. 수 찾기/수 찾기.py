# 이진탐색은 정렬된 수를 기반으로 진행된다.
import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline


N = input()
A = list(map(int, input().split()))
A_length = len(A)
M = input()
B = list(map(int, input().split()))
B_length = len(B)

A.sort()

def BinarySearch(A, init, last, num) :    
    if init > last :
        return 0  
    mid = (init + last) // 2
    if A[mid] == num :
        return 1
    elif A[mid] > num :
        return BinarySearch(A, init, mid-1, num)
    elif A[mid] < num :
        return BinarySearch(A, mid+1, last, num)

for i in B : 
    ans = BinarySearch(A, 0, len(A)-1, i)
    print(ans)
