#
# Title: BOJ 12865 평범한 배낭
# Date: 24.04.01
#
import sys
input = sys.stdin.readline

n,k = map(int,input().split())

objs = []
for i in range(n):
    # (weight, value) 형식으로 입력받아, 리스트 저장
    objs.append(tuple(map(int,input().split()))) 
    
# (n+1) x (k+1) 크기의 배열만들기
# 최대 n개의 물건, 최대 k의 무개만큼 저장, 확인
dp = [[0] * (k+1) for _ in range(n+1)]

# 모든 물건에 대해 차례대로 확인
for i in range(1,n):
    #각 물건에 대해서 무게별 최대 가치 확인
    for j in range(1,k+1):
        obj = objs[i]
        weight = obj[0]
        value = obj[1]
        
        # 현재 담을 수 있는 무게보다 넣을 물건의 무게가 크면 넣지 못한
        # 이전 배낭 그대로 저장 후 continue
        if weight > j:
            dp[i][j] = dp[i-1][j]
            continue
        #이번 물건을 넣었을 때의 가치 = 현재 가치 + 이 무게를 뺀 나머지 무게일 때의 가치
        #이번 물건을 넣지 않고 이전 동일 무게의 가치
        dp[i][j] = max(dp[i-1][j], value + dp[i-1][j-weight])
print(dp[n-1][k])