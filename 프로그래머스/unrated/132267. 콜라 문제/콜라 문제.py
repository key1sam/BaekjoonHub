import sys
sys.setrecursionlimit(10**9)



def solution(a, b, n):
    global answer
    global quotient
    global remain
    
    answer = 0
    quotient = 0
    remain = 0
    calc(n, a, b)
    
    return answer


def calc(num, a, b) :
    global answer
    global quotient
    global remain
    if num // a == 0 :
        return
    if num % a == 0 :
        answer += (num//a)*b
        calc((num//a)*b, a, b)
    else :
        answer += (num // a)*b
        remain =  num % a
        quotient = (num // a)*b
        calc((quotient + remain), a, b)