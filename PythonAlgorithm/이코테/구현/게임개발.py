#
# Title: 이코테 게임개발
# Theory : 구현
# Date: 23.05.08
#
import time as t
def turnleft():
    global d
    d -=1
    if(d == -1):
        d = 3
    return

n,m = map(int,input().split())
x,y,d = map(int,input().split())
li =[]
#리스트 컴프리헨션 문법 
isVisited = [[0] * m for _ in range(n)]
isVisited[x][y] = 1

for row in range(n):
    li.append(list(map(int,input().split())))
    
cnt = 1
steps = [(-1,0),(0,1),(1,0),(0,-1)]

turn_time =0
while True:    
    turnleft()
    print(x,y,d,turn_time)
    t.sleep(0.3)
    nx = x + steps[d][0]
    ny = y + steps[d][1]
    if turn_time == 4:
        nx = x - steps[d][0]
        ny = y - steps[d][1]
        if li[nx][ny] == 0:
            x = nx
            y = ny
        else:
            break
        turn_time = 0
    if nx > n or nx < 0 or ny > n or ny < 0:
        turn_time+=1
        continue
    if isVisited[nx][ny] == 1 or li[nx][ny] == 1:
        turn_time+=1
        continue
    
    isVisited[nx][ny] = 1
    x = nx
    y = ny
    cnt +=1
    turn_time = 0
print(cnt)