#
# Title: BOJ 11650 좌표 정렬하기
# Theory : 정렬
# Date: 23.05.12
#
import sys
input = sys.stdin.readline

n = int(input)

arr = []
for i in range(n):
    [a, b] = map(int, input.split())
    arr.append([a, b])


s_arr = sorted(arr)

for i in range(n):
    print(s_arr[i][0], s_arr[i][1])
