#
# Title: BOJ 1204 [S/W 문제해결 기본] 1일차 - 최빈수 구하기
# Date: 24.05.02
#
# import sys
# sys.stdin = open("input.txt", "r")

T = int(input())
for test_case in range(1, T + 1):
    nums = [0] * 101
    n = input()
    grades = sorted(list(map(int,input().split())))
    max_cnt = 0
    max_grade = 0
    for i in grades:
        nums[i] += 1
        if nums[i] >= max_cnt:
            max_cnt = nums[i]
            max_grade = i
    print("#{0} {1}".format(test_case, max_grade))