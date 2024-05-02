#
# Title: SWEA 1284 수도 요금 경쟁
# Date: 24.05.02
#

T = int(input())
for test_case in range(1, T + 1):
    P,Q,R,S,W = map(int,input().split())
    totalA = W*P
    totalB = Q + (W-R)*S
    if R > W:
        totalB = Q
    if totalA < totalB:
        print("#" + str(test_case) + " " + str(totalA))
    else:
        print("#" + str(test_case) + " " + str(totalB))
        