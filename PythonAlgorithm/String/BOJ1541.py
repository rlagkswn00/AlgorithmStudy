#
# Title: BOJ 1541 잃어버린 괄호
# Date: 24.04.10
#
import sys
input = sys.stdin.readline

exp = input()
splited_exp = exp.split("-")
result = 0
total_list = []
for i in splited_exp:
    temp = i.split("+")
    sum = 0
    for j in temp:
        sum += int(j)
    total_list.append(sum)
result += total_list[0]
for i in range(1,len(total_list)):
    result -= int(total_list[i])
print(result)