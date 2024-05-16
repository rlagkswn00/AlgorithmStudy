#
# Title: SWEA 2806
# Date: 24.05.17
#

dx = [0,0,1,-1,1,1,-1,-1]
dy = [1,-1,0,0,1,-1,1,-1]
def dfs(n):
    if n == N:
        global cnt
        cnt+=1
        return

    for i in range(N):
        # print(n,i,board)
        flag = False
        for j in range(8):
            for k in range(N):
                cx = dx[j]*k + n
                cy = dy[j]*k + i
                if cx < 0 or cx >= N or cy < 0 or cy >= N:
                    continue
                if board[cx][cy] == -1:
                    flag = True
                    break
            if flag:
                break

        if flag:
            continue

        board[n][i] = -1
        dfs(n+1)
        board[n][i] = 0

T = int(input())
for test_case in range(1, T + 1):
    N = int(input())
    board = [[0] * N for _ in range(N)]
    cnt = 0
    dfs(0)
    print(f'#{test_case} {cnt}')
