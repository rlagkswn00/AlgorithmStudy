#
# Title: BOJ 15657 N과 M(8)
# Date: 24.01.25
#
import sys
input = sys.stdin.readline

N, M = map(int, input().split())
num_arr = list(map(int, input().split()))
num_arr.sort()

out_arr = []


def dfs(depth, next_idx):
    if depth == M:
        print(*out_arr)
        return

    for i in range(next_idx, N):
        out_arr.append(num_arr[i])
        dfs(depth+1, i)
        out_arr.pop()


dfs(0, 0)
