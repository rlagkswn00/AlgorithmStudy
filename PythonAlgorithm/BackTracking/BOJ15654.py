#
# Title: BOJ 15654 N과 M(5)
# Date: 24.01.20
#
import sys
input = sys.stdin.readline

N, M = map(int, input().split())
numbers = [int(x) for x in input().split()]
numbers.sort()
box = []


def dfs(n):
    if n == M:
        print(' '.join(map(str, box)))
        return

    for i in range(N):
        if numbers[i] in box:
            continue
        box.append(numbers[i])
        dfs(n+1)
        box.pop()


dfs(0)
