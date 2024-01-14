#
# Title: Programmers 60058 괄호 변환
# Date: 24.01.14
#

#solution 시작
def solution(p):
    answer = '' #반환값 초기화
    
    # 빈문자열이면 빈문자열 그대로 반환 종료
    if p == '':
        return p
    
    #올바른 문자열인지
    if check(p):
        return p
    
    #u,v 분할
    u,v =seperate(p)
    
    # u가 올바른 문자열인지 확인
    if check(u):
        #맞다면 v에 대해서 쭉 분할실행해서 u에 붙힘
        return u + solution(v)
    
    answer += '('
    answer += solution(v)
    answer += ')'
    
    u = u[1:-1] # 첫번째 마지막 제거
    for i in change(u):
        answer += i
        
    return answer #반환

def check(p):
    x = y = 0
    for i in p:
        if i == '(':
            x += 1
        if i == ')':
            y += 1
            if x < y:
                return False;
    return True

#분할
def seperate(p):
    x = y = 0
    num = 0
    u = ''
    v = ''
    while True:
        if p[num] == '(':
            x += 1
        elif p[num] == ')':
            y += 1
        num += 1
        #균형잡힌 문자열 : 개수가 같은 문자열로 분할
        if x == y:
            #u
            for i in range(num):
                u += p[i]
            #v
            for j in range(num,len(p)):
                v += p[j]
            break
    return u,v

def change(string):
    r = {"(": ")", ")":"("}
    return [r[s] for s in string]