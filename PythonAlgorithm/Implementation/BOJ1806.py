#
# Title: BOJ 1806 부분합
# Date: 24.04.17
#
import sys
input = sys.stdin.readline

N,S = map(int,input().split())
arr = list(map(int,input().split()))
cnt = 0

head = 1
tail = 0
temp = arr[0]
result = 100000001
while head <= N:
    if temp >= S:
        result = min((head-tail),result)
        temp -= arr[tail]
        tail += 1
        continue
    elif head == N:
        break
    else:
        temp += arr[head]
        head += 1
if result == 100000001:
    print(0)
else:
    print(result)