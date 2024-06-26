#
# Title: BOJ 1022 터렛
# Date: 24.06.26
#
import sys
input = sys.stdin.readline

T = int(input())
for i in range(T):
    x1,y1,r1,x2,y2,r2 = map(int,input().split())
    result = 0
    distance = (x1-x2)**2 + (y1-y2)**2 # 중앙점 간 직선거리의 제곱
    r = (r1 + r2)**2 # 반지름 합 길이의 제곱
    gap_r = (r1-r2)**2 #반지름 차 길이의 제곱
    if x1==x2 and y1==y2 and r1 == r2: # 두 원이 같음)
        result = -1
    elif r < distance: # 접하지 않음(외부)
        result = 0
    elif r == distance: # 외접
        result = 1
    elif r > distance: # 내접한 상태보다 직선거리가 더 짧을 때
        if gap_r < distance: # 두 점에서 만남
            result = 2
        elif gap_r == distance: # 내접
            result = 1
        elif gap_r > distance: # 접하지 않음(내부)
            result = 0
    print(result)