def solution(k, score):
    count = 0 # count 값을 기반으로 k번째 도달 전은 계속 추가, 아닐 경우 비교 시작
    result = [] # 최소 점수 결과값
    contest = [] # 명예의 전당 리스트
    
    for i in score :
        if count < k :
            contest.append(i)
            count += 1
        elif i > min(contest) : # i가 min(contest)보다 작은 경우는 현재 contest에서 최소 값을 result에 다시 넣어준다.
             contest.remove(min(contest))
             contest.append(i)
        result.append(min(contest))
    return result

   