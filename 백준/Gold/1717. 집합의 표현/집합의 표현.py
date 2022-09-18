import sys
input = sys.stdin.readline
sys.setrecursionlimit(100000)
N, M = map(int, input().split())
array = [0] * (N+1) # 1~N개의 노드


# 재귀함수로 부모를 계속 찾는다.
def find(num) :
    if num == array[num] :
        return num
    else :
        array[num] = find(array[num])  # 여기에서 틀렸다. array[num]인데 처으메 array라고 해서 오류
        return array[num]

def union(num1, num2) :
    num1 = find(num1)
    num2 = find(num2)
    if num1 != num2 : # 부모노드가 다를 경우 같은 집합이 되어야하므로 한쪽의 부모 값을 다른 것과 동일하게 한다. -> 같은 집합!
        array[num2] = num1

def checkSame(num1, num2) :
    num1 = find(num1)
    num2 = find(num2)
    if num1 == num2 :
        return True
    return False

for i in range(0, N+1) :
    array[i] = i

for i in range(M) :
    question, num1, num2 = map(int, input().split())
    if question == 0 :
        union(num1, num2)
    else :
        if checkSame(num1, num2) :
            print('YES')
        else : 
            print('NO')