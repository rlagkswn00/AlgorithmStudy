#
# Title: 이코테 왕실의 나이트
# Theory : 구현
# Date: 23.05.08
#

inputData = input()
row = int(inputData[1])
# ord() -> char to Unicode -> 숫자로 변환하여 가로 좌표 값 확인
col = int(ord(inputData[0])-int(ord('a')))+1

steps = [(-2,-1),(-2,1),(2,-1),(2,1),
         (-1,-2),(1,-2),(-1,2),(1,2)]

cnt = 0

for i in steps:
    nRow = row + i[0]
    nCol = col + i[1]
    if nRow >=1 and nRow <=8 and nCol >=1 and nCol <=8:
        cnt+=1

print(cnt)