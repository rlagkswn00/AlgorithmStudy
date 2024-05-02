#
# Title: SWEA 1933 간단한 N의 약수
# Date: 24.05.02
#

for test_case in range(1, 2):
    N = int(input())
    result = ""
    for i in range(1,N+1):
        if N % i == 0:
            result += str(i) + " "
    print(result)