#
# Title: BOJ 15829 Hashing
# Theory :
# Date: 23.05.15
#
import sys
input = sys.stdin.readline
M = 1234567891
r = 31

L = int(input())
s = input()

num = 0

for i in range(L):
    num += (ord(s[i]) - 96) * (r ** i)

# print(L, s)
print(num % M)
