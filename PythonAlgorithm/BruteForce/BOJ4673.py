#
# Title: BOJ 4673 셀프 넘버
# Date: 24.03.12
#
import sys
input = sys.stdin.readline

def d(cur_num):
    str_cur_num = str(cur_num)
    ans = cur_num
    for i in str_cur_num:
        ans += int(i)
    return ans

num_list = set(range(1,10001))
for i in range(1,10001):
    answer = d(i)
    if answer in num_list:
        num_list.remove(answer)

for i in num_list:
    print(i)