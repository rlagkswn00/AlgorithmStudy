#
# Title: SWEA 2817 부분 수열의 합
# Date: 24.05.15
#

def dfs(n,summary):
    global answer
    if n == N:
        if summary == K:
            answer += 1
        return
    dfs(n+1, summary + nums[n])
    dfs(n+1, summary)


T = int(input())
for test_case in range(1,T+1):
    N,K = map(int,input().split())
    nums = list(map(int,input().split()))
    answer = 0

    dfs(0,0)
    print(f'#{test_case} {answer}')