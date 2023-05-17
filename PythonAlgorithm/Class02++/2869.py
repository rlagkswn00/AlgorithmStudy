#
# Title: BOJ 2869 달팽이는 올라가고 싶다
# Theory :
# Date: 23.05.17
#
import sys
input = sys.stdin.readline

A, B, V = map(int, input().split())
day = (V-B)/(A-B)

print(int(day) if day == int(day) else int(day)+1)

# 시간초과
# def up():
#     global nowHeight, A, cnt
#     nowHeight += A
#     cnt += 1

#     if nowHeight >= V:
#         print(cnt)
#         exit()
#     return


# def down():
#     global nowHeight, B
#     nowHeight -= B
#     return


# while nowHeight <= V:
#     up()
#     down()
