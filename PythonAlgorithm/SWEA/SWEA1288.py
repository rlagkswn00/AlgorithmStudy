#
# Title: SWEA 1288 새로운 불면증 치료법
# Date: 24.05.02
#

T = int(input())
for test_case in range(1, T + 1):
    cnt_list = []
    N = int(input())
    base = N
    while True:
        for i in str(N):
            if i not in cnt_list:
                cnt_list.append(i)
        if len(cnt_list) == 10:
            break
        N = N + base
    print("#" + str(test_case) + " " + str(N))