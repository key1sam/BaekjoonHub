def solution(slice, n):
    if n <= slice :
        return 1
    else :
        return (n-1)//slice + 1  