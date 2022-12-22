def solution(t, p):
    answer = 0
    wordNum = 0
    
    if len(p) == 1 : # p의 길이가 1일 때
        for i in range(len(t)) :
            if t[i] <= p :
                answer += 1
                
    else : # p의 길이가 2 이상인 경우
        wordNum = len(t) - len(p) + 1 # 발생할 수 있는 부분문자열 경우의 수
        for i in range(wordNum) :
            tmp = t[i:i+len(p)] 
            if tmp <= p :
                answer += 1
         
    return answer