#
# Title: BOJ 7568 덩치
# Theory : 구현, 브루트포스
# Date: 23.07.08
#
import sys
input = sys.stdin.readline
n = int(input())
sizeList = []
for _ in range(n):
    x, y = map(int, input().split())
    sizeList.append((x, y))

for size in sizeList:
    rank = 1
    for s in sizeList:
        if size[0] < s[0] and size[1] < s[1]:
            rank += 1

    print(rank, end=' ')
