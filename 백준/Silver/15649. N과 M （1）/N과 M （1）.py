from itertools import permutations #itertools에서 순열과 관련된 함수 가져오기
data = []
answer = []
N, M = map(int,input().split())
if (M == 1) :
    for i in range(N):
        print(i+1)
elif (M == 2) :
    for i in range(N) :
        data.append(i+1)
        result = list(permutations(data, M))# data에서 M개를 골라서 조합을 나열한다.
    for i in range(len(result)) :
        a, b = result[i]
        print(a, b)
elif (M == 3) :
    for i in range(N) :
        data.append(i+1)
        result = list(permutations(data, M))
    for i in range(len(result)) :
        a, b, c = result[i]
        print(a, b, c)
elif (M == 4) :
    for i in range(N) :
        data.append(i+1)
        result = list(permutations(data, M))
    for i in range(len(result)) :
        a, b, c, d = result[i]
        print(a, b, c, d)
elif (M == 5) :
    for i in range(N) :
        data.append(i+1)
        result = list(permutations(data, M))
    for i in range(len(result)) :
        a, b, c, d, e = result[i]
        print(a, b, c, d, e)
elif (M == 6) :
    for i in range(N) :
        data.append(i+1)
        result = list(permutations(data, M))
    for i in range(len(result)) :
        a, b, c, d, e, f = result[i]
        print(a, b, c, d, e, f)
elif (M == 7) :
    for i in range(N) :
        data.append(i+1)
        result = list(permutations(data, M))
    for i in range(len(result)) :
        a, b, c, d, e, f, g = result[i]
        print(a, b, c, d, e, f, g)
elif (M == 8) :
    for i in range(N) :
        data.append(i+1)
        result = list(permutations(data, M))
    for i in range(len(result)) :
        a, b, c, d, e, f, g, h = result[i]
        print(a, b, c, d, e, f, g, h)