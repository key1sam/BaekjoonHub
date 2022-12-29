# k는 최고점수, m은 상자 당 단위개수

from collections import deque

def solution(k, m, score):
    
    score.sort(reverse = True) # 최대 수익을 위해 역으로 정렬
    deq = deque(score)
    answer = 0
    result = 0
    box = len(score) // m # 가능한 상자의 수
    
    for i in range(box) :
        appleBox = []
        for j in range(m) : 
            appleBox.append(deq.popleft()) # 가장 높은 수부터 box 안에 들어갈 것
        result += min(appleBox)*m    
    
    return result