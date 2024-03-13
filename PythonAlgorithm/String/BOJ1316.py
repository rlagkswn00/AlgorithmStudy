#
# Title: BOJ 1316 그룹 단어 체커
# Date: 24.03.13
#
import sys
input = sys.stdin.readline

N = int(input())
cnt = 0

for _ in range(N):
    alphabet_set = set()
    input_str = input().strip() # aba
    prev_str = ''
    flag = False
    for s in input_str:
        if s == prev_str: # not not  not
            continue
        if s in alphabet_set: # not not true
            flag = True
            break
        alphabet_set.add(s) # set : a b
        prev_str = s # prev_str = b
    if not flag:
        cnt+=1
print(cnt)