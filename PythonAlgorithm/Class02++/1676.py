#
# Title: BOJ 1676 팩토리얼 0의 개수
# Theory :
# Date: 23.07.04
#
n = int(input())
cnt = 0
while n != 0:
    n //= 5
    cnt += n

print(cnt)
