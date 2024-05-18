T = int(input())

def dfs(n,cal,grade):
    if cal > L:
        return

    if n == N:
        global result
        result = max(result, grade)
        return

    dfs(n+1,cal + burger[n][1], grade + burger[n][0])
    dfs(n+1,cal,grade)

for test_case in range(1, T + 1):
    N,L = map(int,input().split())
    burger = []
    visited = [False] * N
    for i in range(N):
        burger.append(list(map(int,input().split())))
    result = 0

    dfs(0,0,0)
    print(f'#{test_case} {result}')