#
# Title: SWEA 4299 태혁이의 사랑은 타이밍
# Date: 24.05.14
#
T = int(input())
for test_case in range(1, T + 1):
    D,H,M = map(int,input().split())
    day = 11
    hour = 11
    minute = 11
    total_minute = 0
    flag = False

    H += (D-day) * 24
    M += (H-hour) * 60
    total_minute += (M-minute)

    if total_minute >= 0:
        print("#" + str(test_case) + " " +str(total_minute))
    else:
        print("#" + str(test_case) + " -1")

