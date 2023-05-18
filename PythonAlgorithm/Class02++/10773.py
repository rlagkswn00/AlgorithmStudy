#
# Title: BOJ 10773 제로
# Theory : 구현, 자료구조, 스택
# Date: 23.05.18
#
import sys

input = sys.stdin.readline
st = []

K = int(input())
for i in range(K):
    tmp = int(input())
    if tmp == 0:
        st.pop()
    else:
        st.append(tmp)

sum = 0
for i in st:
    sum += i
print(sum)
