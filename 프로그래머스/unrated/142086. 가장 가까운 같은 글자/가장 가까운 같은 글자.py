def solution(s):
    answer = []
    dic = {}
    
    for i in range(len(s)) :
        if s[i] not in dic :
            dic[s[i]] = i
            answer.append(-1)
        else :
            idx = i - dic[s[i]]
            answer.append(idx)
            dic[s[i]] = i
            
    return answer