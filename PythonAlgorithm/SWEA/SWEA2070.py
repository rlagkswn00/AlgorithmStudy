#
# Title: SWEA 2070 큰 놈, 작은 놈, 같은 놈
# Date: 24.05.02
#

T = int(input())

for test_case in range(1, T + 1):
    nums = list(map(int,input().split()))
    result = "#" + str(test_case) +" "
    
    if nums[0] < nums[1]:
        result += "<"
    elif nums[0] > nums[1]:
        result += ">"
    else:
        result += "="
    print(result)
    