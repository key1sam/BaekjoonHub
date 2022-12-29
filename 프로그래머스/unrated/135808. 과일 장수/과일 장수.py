# k는 최고점수, m은 상자 당 단위개수
# 

from collections import deque

def solution(k, m, score):
    
    score.sort(reverse = True)
    deq = deque(score)
    answer = 0
    result = 0
    box = len(score) // m # 가능한 상자의 수
    
    for i in range(box) :
        tmp = []
        for j in range(m) :
            tmp.append(deq.popleft())
        result += min(tmp)*m    
    
    return result