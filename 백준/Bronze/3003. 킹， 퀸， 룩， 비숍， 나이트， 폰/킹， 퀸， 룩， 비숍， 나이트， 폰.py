# 1 1 2 2 2 8
chess = [1, 1, 2, 2, 2, 8]
input_list = list(map(int, input().split()))
ans = []

for i in range(len(input_list)) :
        tmp = chess[i] - input_list[i]
        print(tmp, end = ' ')
