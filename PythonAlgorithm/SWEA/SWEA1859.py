#
# Title: SWEA 1859 백만 장자 프로젝트
# Date: 24.05.02
#

T = int(input())
for test_case in range(1, T + 1):
    N = int(input())
    prices = list(map(int,input().split()))
    prices = prices[::-1]
    
    temp_max = 0
    total = 0
    for i in prices:
        if temp_max > i:
            total += temp_max - i
            continue
        if temp_max <= i:
            temp_max = i
            continue
    print("#{0} {1}".format(test_case,total))
                