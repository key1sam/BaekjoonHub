import sys
input = sys.stdin.readline

N, M = map(int, input().split())
array1 = [[0]* (N+1)]
array2 = [[0]* (N+1) for _ in range(N+1)]

for i in range(N) :
    tmp = [0] + [int(x) for x in input().split()] # N번만큼 입력받는다.
    array1.append(tmp)

#합정렬 구하기
for i in range(1, N+1) : # 나머지 행, 열 초기화
    for j in range(1, N+1) :
        array2[i][j] = array2[i-1][j] + array2[i][j-1] - array2[i-1][j-1] + array1[i][j]

for _ in range(M) :
    x1, y1, x2, y2 = map(int, input().split())
    result = array2[x2][y2] - array2[x1-1][y2] - array2[x2][y1-1] + array2[x1-1][y1-1]
    print(result)



