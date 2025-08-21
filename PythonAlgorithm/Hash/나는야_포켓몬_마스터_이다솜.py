import sys
input = sys.stdin.readline

n,m = map(int,input().split())

p_dir = {}
p_list = []
for i in range(1,n+1):
    pocketmon = input().strip()
    p_dir[pocketmon] = i
    p_list.append(pocketmon)
    
for i in range(m):
    problem = input().strip()
    #숫자면
    if problem.isdecimal():
        problem = int(problem)
        print(p_list[problem-1])
    else:
        print(p_dir[problem])