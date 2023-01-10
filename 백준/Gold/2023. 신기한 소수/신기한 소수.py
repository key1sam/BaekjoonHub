import sys
sys.setrecursionlimit(1000000)
input = sys.stdin.readline
N = int(input())

#소수 구하기
def isPrime(num) :
    for i in range(2, int(num / 2 + 1)) :
        if num % i == 0 :
            return False
    return True

def DFS(number) :
    if len(str(number)) == N :
        print(number)
    else :
        for i in range(1, 10) :
            if i % 2 == 0 :
                continue
            if isPrime(number * 10 + i) :
                DFS(number * 10 + i)
DFS(2)
DFS(3)
DFS(5)
DFS(7)
