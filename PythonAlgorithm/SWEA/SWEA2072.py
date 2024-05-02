#
# Title: SWEA 2072 홀수만 더하기
# Date: 24.05.02
#

T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    sum = 0
    nums = list(map(int,input().split()))
    for i in nums:
        if i % 2 != 0:
            sum+= i
    print("#" + str(test_case) + " " + str(sum))
                
