N = int(input())
tmp = 0

for i in range(1, N+1) :
    for j in str(i) :
        tmp += int(j)
    if (tmp + i == N) :
        print(i)
        break
    elif (i == N) :
        print(0)
    else :
        tmp = 0
        continue