#
# Title: BOJ 1463 1로 만들기
# Date: 24.03.16
#
import sys
input = sys.stdin.readline

x = int(input())
d = [0] * 1000001

# 반대로 2부터 계산함
for i in range(2, x+1):
    # 2와 3으로 나누어떨어지지 않는 경우에 - 1
    d[i] = d[i-1] + 1
    # 2로 나누어 떨어지는 경우
    if i % 2 == 0:
        d[i] = min(d[i], d[i//2] + 1)
    # 3으로 나누어 떨어지는 경우
    if i % 3 == 0:
        d[i] = min(d[i], d[i//3] + 1)
print(d[x])
