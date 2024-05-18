#
# Title: SWEA 1208
# Date: 24.05.18
#

T = 10
for test_case in range(1, T + 1):
    N = int(input())
    nums = list(map(int,input().split()))
    nums.sort(reverse=True)
    for i in range(N):
        nums[0]-=1
        nums[-1]+=1
        nums.sort(reverse=True)
    print(f'#{test_case} {max(nums) - min(nums)}')