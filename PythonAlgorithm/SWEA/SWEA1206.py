#
# Title: SWEA 1206
# Date: 24.05.17
#

T = 10
for test_case in range(1, T + 1):
    N = int(input())
    towers = list(map(int,input().strip().split()))

    result = 0
    for i in range(2,N-2):
        height = towers[i]
        flag = False
        max_near_tower = max(towers[i-2:i]+towers[i+1:i+3])
        if height > max_near_tower:
            result += height - max_near_tower

    print(f'#{test_case} {result}')