def sigma(num) :
    return ((num-1)*num)/2 # num이 3일 경우 n + (n+1) + (n+2)이다. 따라서 num - 1 만큼의 sigma 값이 추가되고 있다.
 
def solution(num, total):
    answer = []
    firstNum = (total - sigma(num)) // num # sigma로 추가된 값만큼 빼주고 num으로 나누면 가장 앞의 숫자가 나온다.
    for i in range(num) :
        answer.append(firstNum)
        firstNum += 1
    return answer