# 2023.01.03 기준, 다시 풀어보기! (문제가 많이 어려운 편..)
# 문자열을 3번 곱하여 문자열 비교를 활용하여 계산하는 코드
# 문자열 비교는 첫번째 글자 인덱스를 비교해 나간다.
def solution(numbers):
    numbers = list(map(str, numbers))
    numbers.sort(key=lambda x: x * 3, reverse=True)
    tmp = int(''.join(numbers))
    return str(tmp)