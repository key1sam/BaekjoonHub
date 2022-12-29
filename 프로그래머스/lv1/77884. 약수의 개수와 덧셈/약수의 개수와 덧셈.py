# ※ 약수의 개수가 홀수개인 모든 수는 제곱수이다. ※

def numOfDivisor (num) :
    count = 0
    for i in range(1, num+1) :
        if num % i == 0 :
            count += 1
    return count

def solution(left, right):
    result = 0
    for i in range(left, right+1) :
        now = numOfDivisor(i)
        if now % 2 == 0 : # 약수의 개수가 짝수이면 더하기
            result += i
        else :
            result -= i
    return result