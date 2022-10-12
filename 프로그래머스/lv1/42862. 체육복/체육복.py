def solution(n, lost, reserve):
    lost.sort()
    reserve.sort()
    for i in reserve :
        if i in lost :
            lost.remove(i)
        else :
            less = i - 1
            more = i + 1
            if (more in lost and more in reserve) :
                continue
            else :
                if less in lost :
                    lost.remove(less)
                elif more in lost :
                    lost.remove(more)
                else :
                    continue
    return n - len(lost) 
