num = list(input())
answer = []
for i in num :
    tmp = int(i)
    answer.append(i)
answer = sorted(answer, reverse = True)

for i in answer :
    print(i, end = '')
