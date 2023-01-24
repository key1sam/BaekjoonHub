import sys
from collections import deque
input = sys.stdin.readline

n,m,start = map(int, input().split())
visited = [False] * (n+1)
graph = [[] for _ in range(n+1)]

for _ in range(m) :
    s, e = map(int, input().split())
    graph[s].append(e)
    graph[e].append(s)

for i in range(n+1) :
    graph[i].sort()

def dfs(now) :
    print(now, end = ' ')
    visited[now] = True
    for i in graph[now] :
        if not visited[i] :
            dfs(i)


def bfs(now) :
    queue = deque()
    queue.append(now)
    visited[now] = True
    while queue :
        nowNode = queue.popleft()
        print(nowNode, end = ' ')
        for i in graph[nowNode] :
            if not visited[i] :
                visited[i] = True
                queue.append(i)
        
dfs(start)
visited = [False] * (n+1)
print()
bfs(start)

