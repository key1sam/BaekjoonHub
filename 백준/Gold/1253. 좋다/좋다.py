import sys
input = sys.stdin.readline

N = int(input())
array1 = list(map(int, input().split()))
count = 0
array1.sort()

left = 0
right = N - 1

for k in range(N) :
    find = array1[k]
    left = 0
    right = N - 1

    while left < right :
        if array1[left] + array1[right] == find :
            if left != k and right != k :
                count += 1
                break
            elif left == k :
                left += 1
            elif right == k :
                right -= 1 
        elif array1[left] + array1[right] < find :
            left += 1
        else : # array1[left] + array1[right] > find 
            right -= 1
print(count)