#
# Title: BOJ 1654 랜선 자르기
# Theory :
# Date: 23.07.03
#
import sys
input = sys.stdin.readline

k, n = map(int, input().split())
lines = []
for _ in range(k):
    lines.append(int(input()))

start = 1
end = max(lines)
mid = 0
cnt = 0

while start <= end:
    cnt = 0
    mid = (start+end) // 2
    for i in lines:
        cnt += i // mid

    if cnt >= n:
        start = mid + 1
    else:
        end = mid-1

print(end)
