#
# Title: 이코테 1이될 때까지
# Theory : 그리디
# Date: 23.05.08
#
n,k = map(int,input().split())
cnt = 0

# while n>=k:
#     while n%k != 0:
#         n-=1
#         cnt+=1
    
#     n //= k
#     cnt+=1
    
# while n>1:
#     n-=-1
#     cnt+=1
# print(cnt)


# 런타임에러 방지법

while True:
    # 나머지 값을 제외한 값 계산
    target = (n//k) * k 
    # 나머지 값 만큼 -1했다고 하고, cnt에 추가
    cnt+=n-target
    n = target
    if n < k:
        break
    cnt += 1
    n //= k
cnt+=(n-1)
print(cnt)