#
# Title: SWEA 2071 평균값 구하기
# Date: 24.05.02
#

T = int(input())

for test_case in range(1, T + 1):
    nums = list(map(int,input().split()))
    print("#" + str(test_case) + " " + str(round(sum(nums)/len(nums))))
    