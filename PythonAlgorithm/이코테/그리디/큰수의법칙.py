#
# Title: 이코테 그리디 큰 수의 법칙
# Date: 23.05.05
#

n,m,k = map(int,input().split())
data = list(map(int,input().split()))

data.sort()
first = data[n-1]
second = data[n-2]

result = 0

while 1:
    for i in range(k):
        if m == 0:
            break
        result += first
        m-=1
    if m==0:
        break
    result+=second
    m-=1
    
print(result)