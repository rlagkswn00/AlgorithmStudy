#
# Title: BOJ 9012 괄호
# Theory : 자료구조, 문자열, 스택
# Date: 23.07.07
#
import sys
input = sys.stdin.readline

n = int(input())

for _ in range(n):
    bracket = input()
    stack = []
    for b in bracket:
        if b == '(':
            stack.append('(')
        elif b == ')':
            if not stack:
                print("NO")
                break
            else:
                stack.pop()
    else:
        if not stack:
            print("YES")
        else:
            print("NO")
