#
# Title: BOJ 2231 분해합
# Theory : 브루트포스 알고리즘
# Date: 23.05.14
#
import sys
input = sys.stdin.readline

n = int(input())
MAX = 1000000

for i in range(1, MAX):

    str_i = str(i)
    num = i

    for k in range(len(str_i)):
        num += int(str_i[k])

    if num == n:
        print(i)
        exit()
print(0)
