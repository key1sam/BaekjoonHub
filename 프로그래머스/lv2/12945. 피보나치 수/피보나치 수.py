import sys
sys.setrecursionlimit(10**6)

memo = [0] * 100001
memo[1] = 1

def fibo(n) :
    global memo
    if memo[n] != 0 :
        return memo[n]
    else :    
        if n == 1 :
            return 1
        elif n == 0 :
            return 0
        else :
            memo[n] = fibo(n-1) + fibo(n-2)
            return memo[n]

def solution(n):
    answer = fibo(n) % 1234567
    return answer