def solution(common):
    if common[0] and common[1] == 1 :
        return 1
    else :
        if common[1] - common[0] == common[2] - common[1] : # 등차수열
            return common[-1] + (common[1] - common[0])
        else : # 등비수열
            return common[-1] * (common[1]//common[0])