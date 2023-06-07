import sys
input = sys.stdin.readline

N = int(input())

l = {}

for _ in range(N):
    file = input()
    fileType = file.split(".")[1].split("\n")[0]
    # print(fileType)
    if fileType not in l:
        l[fileType] = 1
    else:
        l[fileType] += 1

keyList = list(l.keys())
keyList.sort();
print(keyList)

for i in keyList:
    print(i,l[i])

