#
# Title: BOJ 14888 연산자 끼워넣기
# Date: 24.01.10
#
import sys
input = sys.stdin.readline

N = int(input()) # 수 개수
nums = list(map(int,input().split())) # 수열
add, sub, mul, div = map(int,input().split()) # + - x /

max_val = -sys.maxsize
min_val = sys.maxsize

def dfs(n, total, add, sub, mul, div):
    global max_val,min_val

    if n == N:
        max_val = max(max_val, total)
        min_val = min(min_val, total)
        return
    
    if add:
        dfs(n+1, total + nums[n], add-1, sub, mul, div)
    if sub:
        dfs(n+1, total - nums[n], add, sub-1, mul, div)
    if mul:
        dfs(n+1, total * nums[n], add, sub, mul-1, div)
    if div:
        dfs(n+1, int(total / nums[n]), add, sub, mul, div-1)

dfs(1,nums[0],add,sub,mul,div)
print(max_val)
print(min_val)

