#
# Title: BOJ 2941 크로아티아 알파벳
# Date: 24.03.14
#
import sys
input = sys.stdin.readline

str_arr = ["c=","c-","dz=","d-","lj","nj","s=","z="]

input_str = input()

cnt = 0
i = 0
while i < len(input_str)-1:
    flag = False
    for s in str_arr:
        if s == input_str[i:i+len(s)]:
            cnt += 1
            i += len(s)
            flag = True
            break
    if flag:
        continue
    else:
        cnt+=1
        i+=1
print(cnt)