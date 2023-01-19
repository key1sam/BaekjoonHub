def solution(food):
    answer = ''
    for i in range(1, len(food)) :
        quotient = food[i] // 2
        answer += str(i) * quotient
    answer += '0'
    reversed_str = answer[::-1] # 문자열을 뒤집는 방법
    for i in range(1, len(reversed_str)) :
        answer += reversed_str[i]  
    return answer