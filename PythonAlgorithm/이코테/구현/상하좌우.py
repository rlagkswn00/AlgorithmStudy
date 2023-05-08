#
# Title: 이코테 상하좌우
# Theory : 구현
# Date: 23.05.08
#

def solve():
    n = int(input())
    li = input().split()
    x,y = 1,1
    
    for i in li:
        if i == 'R':
            if y<n:
                y+=1
        elif i == 'L':
            if y>1:
                y-=1
        elif i == 'U':
            if x>1:
                x-=1
        else:
            if x<n:
                x+=1
    
    print(x,y)
    
    return;
    
    
    
solve()