#
# Title: BOJ 11651 좌표 정렬하기
# Theory : 정렬
# Date: 23.05.19
#
import sys
input = sys.stdin.readline

N = int(input())
li = [[0] * 2 for _ in range(N)]
for i in range(N):
    a, b, = map(int, input().split())
    li[i][0] = a
    li[i][1] = b
li2 = sorted(li, key=lambda x: (x[1], x[0]))
for i in li2:
    print(i[0], i[1])
