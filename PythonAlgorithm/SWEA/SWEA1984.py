#
# Title: BOJ 1984 중간 평균값 구하기
# Date: 24.05.02
#

T = int(input())

for test_case in range(1, T + 1):
    nums = list(map(int,input().split()))
    total = sum(nums) - max(nums) - min(nums)
    cnt = len(nums) - 2
    avg = round(total/cnt)
    print("#{0} {1}".format(test_case,avg))