import sys
from collections import deque
input = sys.stdin.readline

#상하좌우를 탐색하기 위한 리스트 선언
dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]

n, m = map(int, input().split())
graph = [[0] * m for _ in range(n)]
visited = [[False] * m for _ in range(n)]

for i in range(n) :
    visited.append([False * (m)])

for i in range(n) :
    numbers = list(input())
    for j in range(m) :
        graph[i][j] = int(numbers[j])

def bfs(i, j) :
    queue = deque()
    queue.append((i, j))
    visited[i][j] = True
    while queue :
        now = queue.popleft()
        for k in range(4) :
            x = now[0] + dx[k]
            y = now[1] + dy[k]
            if x >= 0 and y >= 0 and x < n and y < m :
                if graph[x][y] != 0 and not visited[x][y] :
                    visited[x][y] = True
                    graph[x][y] = graph[now[0]][now[1]] + 1
                    queue.append((x, y))  
 
bfs(0, 0)
print(graph[n-1][m-1])