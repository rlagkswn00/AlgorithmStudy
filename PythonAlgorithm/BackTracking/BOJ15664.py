#
# Title: BOJ 15664 N과 M(10)
# Date: 24.01.26
#

import sys
input = sys.stdin.readline
N, M = map(int, input().split())
num_arr = sorted(list(map(int, input().split())))
out_arr = []  # 자리가 상관있음.
visited = [False] * N  # 한번만 사용

#다음 자리에는 다음인덱스부터하되,
#같은 숫자면 스킵해야함
def dfs(depth, next_idx):
    if depth == M:
        print(*out_arr)
        return

    prev_num = 0
    for i in range(next_idx, N):
        if prev_num != num_arr[i] and not visited[i]:
            prev_num = num_arr[i]
            out_arr.append(num_arr[i])
            visited[i] = True
            dfs(depth+1, i+1)
            out_arr.pop()
            visited[i] = False


dfs(0, 0)
