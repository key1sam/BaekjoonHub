from collections import deque

def solution(maps):
    low, col = len(maps), len(maps[0])
    visited = [[False for _ in range(col)] for _ in range(low)]
    return bfs(maps, 0, 0, visited)
    
def bfs(maps, x, y, visited):
    low, col = len(maps), len(maps[0])
    queue = deque([(x, y)]) # 방문하는 점을 추가
    visited[x][y] = True
    distance = {(x, y): 0}
    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i] 
            if 0<=nx<low and 0<=ny<col and not visited[nx][ny] and maps[nx][ny]:
                if (nx, ny) == (low-1, col-1): return distance[(x, y)] + 2
                queue.append((nx, ny))
                distance[(nx, ny)] = distance[(x, y)] + 1
                visited[nx][ny] = True
    return -1