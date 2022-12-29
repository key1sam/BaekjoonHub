def solution(k, score):
    count = 0
    result = []
    contest = [] 
    
    for i in score :
        if count < k :
            contest.append(i)
            count += 1
        elif i > min(contest) :
             contest.sort()
             del contest[0]
             contest.append(i)
        result.append(min(contest))
    return result

   