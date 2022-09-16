import sys
from collections import deque
input = sys.stdin.readline

N, M, K, X = map(int, input().split())
Graph = [[] for _ in range(N+1)]
answer = []
visited = [-1] * (N + 1)

def BFS(v) :
    queue = deque() # import collections로 선언하면 coleections.deqeue()을 입력해줘야한다.
    queue.append(v)
    visited[v] += 1 # BFS를 수행할수록 거리가 늘어난다.
    while queue :
        now_Node = queue.popleft()
        for i in Graph[now_Node] :
            if visited[i] == -1 :
                queue.append(i)
                visited[i] = visited[now_Node] + 1

for _ in range(M) :
    num1, num2 = map(int, input().split())
    Graph[num1].append(num2)

BFS(X)

for i in range(N+1) :
    if visited[i] == K :
        answer.append(i)

if not answer :
    print(-1)
else :
    answer.sort()
    for i in answer :
        print(i)
            
