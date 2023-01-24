import sys
input = sys.stdin.readline

N, M = map(int, input().split()) 
visited = [False] * (N+1)
graph = [[] for _ in range (N + 1)]
check = False

def dfs(now, depth) :
    global check
    if depth == 5 :
        check = True
        return
    visited[now] = True
    for i in graph[now] :
        if not visited[i] :
            dfs(i, depth+1)
    visited[now] = False # 다른 노드에서도 시작하여 깊이가 5인 노드가 있는지 탐색해야함
    
for _ in range(M) :
    s, e = map(int, input().split()) 
    graph[s].append(e) # 양방향 그래프
    graph[e].append(s) # 양방향 그래프

for i in range(N) :
    dfs(i, 1)
    if check == True :
        break
        
if check == True :
    print(1)
else :
    print(0)