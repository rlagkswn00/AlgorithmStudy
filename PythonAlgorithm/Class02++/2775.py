#
# Title: BOJ 2775 부녀회장이 될테야
# Theory :
# Date: 23.05.16
#

T = int(input())

for i in range(T):
    k = int(input())
    n = int(input())

    floor0 = [x for x in range(1, n+1)]
    for k in range(k):
        for j in range(1, n):
            floor0[j] += floor0[j-1]
    print(floor0[n-1])
