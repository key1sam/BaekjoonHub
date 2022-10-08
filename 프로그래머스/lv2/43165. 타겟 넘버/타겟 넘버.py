from collections import deque


def solution(numbers, target):
    answer = 0
    queue = deque()
    queue.append([numbers[0], 0])
    queue.append([-1*numbers[0], 0])
     
    while queue :
        result, idx = queue.popleft() 
        if idx < len(numbers)-1 :
            queue.append([result + numbers[idx+1], idx+1])
            queue.append([result - numbers[idx+1], idx+1])
        else :
            if result == target :
                answer += 1
    return answer
            
    
        
    
    
    
    return answer