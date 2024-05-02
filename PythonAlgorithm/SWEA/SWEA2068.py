#
# Title: SWEA 2068 최댓값 구하기
# Date: 24.05.02
#

T = int(input())

for test_case in range(1, T + 1):
    nums = list(map(int,input().split()))
    result = "#" + str(test_case) +" "
    result += str(max(nums))
    
    print(result)
    