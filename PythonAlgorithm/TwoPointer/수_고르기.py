import sys
input = sys.stdin.readline

n,m = map(int,input().split())
nums = [int(input()) for _ in range(n)]

nums = sorted(nums)

head = 0
tail = 0

result = sys.maxsize

for head in range(n):    
    while tail < n:
        now = nums[tail] - nums[head]
        
        if now >= m:
            result = min(result,now)
            break
        else:
            tail += 1
            
print(result)