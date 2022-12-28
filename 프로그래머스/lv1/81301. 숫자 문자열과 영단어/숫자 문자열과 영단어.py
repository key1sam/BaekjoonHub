def solution(s):
    answer = 0
    num_list = ['zero', 'one', 'two', 'three', 'four',
         'five', 'six', 'seven', 'eight', 'nine']
    for i in num_list :
        if i in s :
            s = s.replace(i, str(num_list.index(i))) # s를 바꾸는데, i를 str(num_list.lindex(i))로 변경한다
    answer = int(s)
    return answer