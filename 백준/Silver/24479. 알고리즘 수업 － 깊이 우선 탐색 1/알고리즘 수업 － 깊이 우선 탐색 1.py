import sys
sys.setrecursionlimit(10**9)
input = sys.stdin.readline

N, M, E = map(int, input().split())
visited = [0 for _ in range(N+1)] # 0번 인덱스 사용 X
graph = [[]  for _ in range(N+1)] # 0번 인덱스 사용 X
count = 1

for _ in range(M) :
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)

def dfs(R) :
    global count
    visited[R] = count
    graph[R].sort() # 숫자가 작은 노드부터 들리기 위해 정렬
    for i in graph[R] :
        if visited[i] == 0:
            count += 1
            visited[i] = count
            dfs(i)

dfs(E)

for i in range(1, N + 1) :
    print(visited[i])

