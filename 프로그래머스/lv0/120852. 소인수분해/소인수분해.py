def solution(n):
    answer = []
    cnt = 2
    while (n > 1) : # 계속 나누다가 1 이하가 되면 나눌 수 없음
        if n % cnt == 0 :
            n /= cnt
            answer.append(cnt)
        else :
            cnt += 1
    answer = set(answer)
    answer = list(answer)
    answer.sort()
    return answer