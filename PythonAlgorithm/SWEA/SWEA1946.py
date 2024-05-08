#
# Title: SWEA 1946 간단한 압축 풀기
# Date: 24.05.08
#

T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    N = int(input())
    result = ""
    total = 0
    for _ in range(N):
        letter, number = input().split()
        number = int(number)
        for i in range(number):
            if total % 10 == 0 and total != 0:
                result += "\n"
            total += 1
            result += letter

    print("#" + str(test_case) +"\n"+ result)

