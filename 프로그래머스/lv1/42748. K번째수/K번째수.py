def solution(array, commands):
    answer = []
    for i in commands :
        i, j, k = i
        tmp = array[i-1 : j]
        tmp.sort()
        answer.append(tmp[k-1])
    return answer