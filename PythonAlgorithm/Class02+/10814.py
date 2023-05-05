#
# Title: BOJ 10814 나이순 정렬
# Theory : 
# Date: 23.05.05
#

n = int(input())
memberList = []

for i in range(n):
    age, name = map(str, input().split())
    age = int(age)
    memberList.append((age, name))

memberList.sort(key = lambda x : x[0])	## (age, name)에서 age만 비교

for i in memberList:
    print(i[0], i[1])