#
# Title: SWEA 10726 이진수 표현
# Date: 24.05.14
#

T = int(input())
for test_case in range(1, T + 1):
    N,M = map(int,input().split())

    flag = True
    for i in range(N):
        etc = M % 2
        M = M // 2
        if etc == 0:
            print("#" + str(test_case) + " OFF")
            flag = False
            break

    if flag:
        print("#" + str(test_case) + " ON")