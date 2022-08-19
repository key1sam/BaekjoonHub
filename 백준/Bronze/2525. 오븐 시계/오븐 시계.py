import sys
A, B = map(int, sys.stdin.readline().split())
C = int(sys.stdin.readline())

minute = B + C
if (minute >= 60) :
    k = minute // 60
    A = A + k
    B = minute % 60
    if (A >= 24) :
        A = A - 24
else :
    B = B + C
print(A, B, end = ' ')
