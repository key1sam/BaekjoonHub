# x와 x가 아닌 모든 글자들이 나온 횟수를 각각 센다.

def solution(s):
    first = s[0]
    firstCnt = 1
    
    pointer = 1
    anotherCnt = 0
    
    answer = 0
    
    while(1) :
        if pointer >= len(s) : # 끝
            answer += 1
            break
        
        if first == s[pointer] :
            firstCnt += 1
            pointer += 1
        else :
            anotherCnt += 1
            pointer += 1
        
        if firstCnt == anotherCnt :
            answer += 1
            if pointer >= len(s) :
                break
            else :
                first = s[pointer]
                firstCnt = 1
                anotherCnt = 0
                pointer += 1
            
    return answer