#
# Title: BOJ 11050
# Theory : 수학, 구현, 조합론
# Date: 23.05.04
#
import math
a,b = map(int,input().split())

division = math.factorial(a-b) * math.factorial(b)
divider = math.factorial(a)
print(int(divider/division))