#
# Title: SWEA 3307 최장 증가 부분 수열
# Date: 24.05.14
#

T = int(input())
for test_case in range(1, T + 1):
    N = int(input())
    nums = list(map(int,input().split()))
    dp = [1] * N
    #1번부터 N-1까지 dp를 채우기 위한 반복무
    for i in range(N):
        #0~i-1(현재위치 전)까지 반복문
        #반복해서 이전 숫자들 중 작은게 있는지 탐색
        #더 작은게 있다면 작은수 위치 수열값(dp[j])에 +1 한 값과
        #현재 dp값을 비교해서 더 큰 값 저장
        #두가지 이상이 가능한 경우때문에 max연산 필요
        for j in range(i):
            if nums[i] > nums[j]:
                dp[i] = max(dp[i], dp[j]+1)
    print("#{} {}".format(test_case,max(dp)))
