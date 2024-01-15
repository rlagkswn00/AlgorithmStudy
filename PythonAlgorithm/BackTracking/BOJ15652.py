#
# Title: BOJ 15652 N과 M(4)
# Date: 24.01.15
#
import sys
input = sys.stdin.readline

N,M = map(int,input().split())
s = []

def dfs(n):
    if len(s) == M:
        print(' '.join(map(str,s)))
        return
    
    for i in range(n, N+1):
        s.append(i)
        dfs(i)
        s.pop()
    
dfs(1)
 