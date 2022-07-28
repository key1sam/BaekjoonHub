import sys
from collections import deque
n = int(sys.stdin.readline())
q = deque([])
for i in range(n):
    s = sys.stdin.readline().split() #이렇게 입력받으면 s가 바로 리스트가 된다.
    if s[0] == 'push':
        q.append(s[1])
    elif s[0] == 'pop':
        if not q:  # q가 비어있을 경우를 이렇게 코딩할 수 있다.
            print(-1)
        else:
            print(q.popleft())
    elif s[0] == 'size':
        print(len(q))
    elif s[0] == 'empty':
        if not q:
            print(1)
        else:
            print(0)
    elif s[0] == 'front':
        if not q:
            print(-1)
        else:
            print(q[0])
    elif s[0] == 'back':
        if not q:
            print(-1)
        else:
            print(q[-1])