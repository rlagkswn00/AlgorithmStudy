#
# Title: BOJ 1566 N과 M(11)
# Date: 24.01.27
#
import sys
input = sys.stdin.readline

N,M = map(int,input().split())
num_arr = sorted(list(map(int,input().split())))
out_arr = []

def dfs(depth):
    if depth == M:
        print(*out_arr)
        return
    prev_num = 0
    for i in range(N):
        if prev_num != num_arr[i]:
            out_arr.append(num_arr[i])
            prev_num = num_arr[i]
            dfs(depth+1)
            out_arr.pop()
    
dfs(0)
