def solution(answers):
    
    answer = [] # 정답을 가장 많이 맞은 사람이 들어있는 리스트
    num1 = [1,2,3,4,5]
    num2 = [2,1,2,3,2,4,2,5]
    num3 = [3,3,1,1,2,2,4,4,5,5]
    
    cnt = [0]*3
    
    # 1번 학생
    for i in range(len(answers)) :
        idx = i % 5
        if answers[i] == num1[idx] :
            cnt[0] += 1
            
    # 2번 학생
    for i in range(len(answers)) :
        idx = i % 8
        if answers[i] == num2[idx] :
            cnt[1] += 1
                
    # 3번 학생
    for i in range(len(answers)) :
        idx = i % 10
        if answers[i] == num3[idx] :
            cnt[2] += 1
            
    maxNum = max(cnt)
    for i in range(len(cnt)) :
        if cnt[i] == maxNum :
            answer.append(i+1)
            
    return answer