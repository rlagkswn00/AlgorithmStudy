#
# Title: SWEA 2050 알파벳을 숫자로 변환
# Date: 24.05.02
#

for test_case in range(1, 2):
    N = input()
    result = ""
    for i in N:
        result += str(ord(i)-64) + " "
    print(result)
