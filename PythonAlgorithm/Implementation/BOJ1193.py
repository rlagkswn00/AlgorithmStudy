#
# Title: BOJ 1193 분수찾기
# Date: 24.03.18
#

n = int(input())

summary_index = 1
col_cnt = 1
for i in range(2,n+1): # 2 3 4 5
    col_cnt += 1 # 1, 2, 3 4 5
    if (summary_index + i) >= n:
        break
    summary_index += i #

denominator = col_cnt #분모
numerator = 1 #분자

for i in range(col_cnt):
    summary_index += 1
    if summary_index >= n:
        break
    denominator -= 1
    numerator += 1
if col_cnt % 2 == 0:
    print(str(numerator) + '/' + str(denominator))
else:
    print(str(denominator) + '/' + str(numerator))