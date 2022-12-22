def solution(t, p):
    answer = 0
    wordNum = len(t) - len(p) + 1 # 발생할 수 있는 부분문자열 경우의 수
    for i in range(wordNum) :
        if t[i:i+len(p)] <= p : # t[i:i+1]로 부분문자열 생성
            answer += 1    
    return answer

