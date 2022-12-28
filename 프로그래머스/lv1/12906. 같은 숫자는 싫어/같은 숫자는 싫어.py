from collections import deque

def solution(arr):
    answer = []
    pointer = 0
    answer.append(arr[0])
    
    for i in range(1, len(arr)) :
        if answer[pointer] == arr[i] :
            continue
        else :
            answer.append(arr[i])
            pointer += 1
            
    return answer