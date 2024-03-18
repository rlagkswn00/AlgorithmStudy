#
# Title: BOJ 1427 소트인사이드
# Date: 24.03.18
#
import sys
input = sys.stdin.readline

n = input()
sort_arr = []
for i in n:
    sort_arr.append(i)

sort_arr.sort(reverse=True)
for i in sort_arr:
    print(i, end='')