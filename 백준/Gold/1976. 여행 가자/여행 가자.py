import sys
input = sys.stdin.readline
sys.setrecursionlimit(100000)

N = int(input())
M = int(input())

Graph = [[0 for _ in range(N+1)] for _ in range(N+1)]

def union(num1, num2) :
    num1 = find(num1)
    num2 = find(num2)
    if num1 != num2 :
        parent[num2] = num1

def find(num1) :
    if parent[num1] == num1 :
        return num1
    else :
        parent[num1] = find(parent[num1])
        return parent[num1]


for i in range(1, N+1) :
    Graph[i] = list(map(int, input().split())) 
    Graph[i].insert(0,0) 

cityRoute = list(map(int, input().split())) # 도시 여행계획
cityRoute.insert(0, 0)

parent = [0] * (N+1)
for i in range(1, N+1) :
    parent[i] = i

for i in range(1, N+1) :
    for j in range(1, N+1) :
        if Graph[i][j] == 1:
            union(i, j)
    
index = find(cityRoute[1])
isConnect = True

for i in range(2, len(cityRoute)) :
    if index != find(cityRoute[i]) :
        isConnect = False
        break
   
if isConnect : 
    print("YES")
else :
    print("NO")