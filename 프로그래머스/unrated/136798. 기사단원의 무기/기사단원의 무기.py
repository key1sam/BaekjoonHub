def count(number) :
    cnt = 0
    for i in range(1, int(number**(1/2) + 1)) :
        if number % i == 0 :
            if number // i == int(number**(1/2)) :
                cnt += 1
            else :
                cnt += 2
        else :
            continue
    return cnt

def solution(number, limit, power): 
    result = 0
    for num in range(1, number+1) :
        if count(num) > limit :
            result += power
        else :
            result += count(num)
    return result

