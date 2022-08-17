import sys

max = 0
answer = []
n, m = map(int, sys.stdin.readline().split())
answer = list(map(int, sys.stdin.readline().split()))

for i in range(0, n-2) :
  for j in range(i+1, n-1) :
    for k in range(j+1, n) :
      if answer[i] + answer[j] + answer[k] > m :
        continue
      elif ((answer[i] + answer[j] + answer[k]) > max) :
        max = answer[i] + answer[j] + answer[k]

print(max) 
