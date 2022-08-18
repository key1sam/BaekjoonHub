import sys
N = int(sys.stdin.readline())
number = [0]*10001

for i in range(N) :
    a = int(sys.stdin.readline())
    number[a] += 1

for i in range(1, len(number)) :
    if (number[i] == 0 ) :
        continue
    for _ in range(number[i]) :
        print(i)

