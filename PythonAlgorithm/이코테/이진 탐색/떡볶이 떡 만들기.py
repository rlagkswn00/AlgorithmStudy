#
# Title: 이코테 떡볶이 떡 만들기
# Date: 24.01.19
#
import sys
input = sys.stdin.readline

N, M = map(int, input().split())
rice_cake = list(map(int, input().split()))

start = 0
end = max(rice_cake)  # 최대 길이를 범위 end
result = 0  # 결과

# 이진탐색
while start <= end:
    total = 0
    mid = (start + end) // 2  # 중앙값 지정
    for i in rice_cake:  # 모든 케이크검사
        if i > mid:  # 길이가 길면 잘리고, 더해짐
            total += i - mid
    if total < M:  # 다 잘라봤는데, 부족하면 줄임
        end = mid - 1
    else:  # 남으면 mid를 올림
        result = mid
        start = mid + 1
print(result)
