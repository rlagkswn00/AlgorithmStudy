#
# Title: 이코테 위에서 아래로
# Date: 24.01.03
#

import sys
input = sys.stdin.readline

n = int(input())
arr = []
for _ in range(n):
    arr.append(int(input()))
    
for item in sorted(arr,reverse=True):
    print(item, end=' ')