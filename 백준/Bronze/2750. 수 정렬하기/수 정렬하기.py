a = int(input());
list_ = [0]*a
for i in range(len(list_)) :
    list_[i] = int(input())
list_.sort()

for i in range(len(list_)):
    print(list_[i])