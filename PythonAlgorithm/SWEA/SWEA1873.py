#
# Title: SWEA 1873 상호의 배틀필드
# Date: 24.05.15
#

T = int(input())
for test_case in range(1,T+1):
    H,W = map(int,input().split())
    board = [list(input()) for _ in range(H)]
    op_cnt = int(input())
    ops = input()
    x = 0
    y = 0

    for i,e in enumerate(board):
        if '>' in e:
            x = i
            y = e.index('>')
            break
        if '<' in e:
            x = i
            y = e.index('<')
            break
        if '^' in e:
            x = i
            y = e.index('^')
            break
        if 'v' in e:
            x = i
            y = e.index('v')
            break

    for op in ops:
        # for i in board:
        #     print("".join(i))
        # print()
        if op == "U":
            #범위 내이고 평지면 위로 한칸 이동, 아니면 현재 자리만 바꿈
            if x != 0:
                if board[x-1][y] == ".":
                    board[x][y] = "."
                    board[x-1][y] = "^"
                    x-=1
                    continue
            board[x][y] = "^"

        elif op == "D":
            # 범위 내이고 평지면 위로 한칸 이동, 아니면 현재 자리만 바꿈
            if x != H-1:
                if board[x + 1][y] == ".":
                    board[x][y] = "."
                    board[x + 1][y] = "v"
                    x+=1
                    continue
            board[x][y] = "v"

        elif op == "L":
            # 범위 내이고 평지면 위로 한칸 이동, 아니면 현재 자리만 바꿈
            if y != 0:
                if board[x][y-1] == ".":
                    board[x][y] = "."
                    board[x][y-1] = "<"
                    y-=1
                    continue
            board[x][y] = "<"

        elif op =="R":
            # 범위 내이고 평지면 위로 한칸 이동, 아니면 현재 자리만 바꿈
            if y != W-1:
                if board[x][y+1] == ".":
                    board[x][y] = "."
                    board[x][y+1] = ">"
                    y+=1
                    continue
            board[x][y] = ">"
        elif op == "S":
            cur_pos = board[x][y]
            if cur_pos == ">":
                for i in range(y,W):
                    target_pos = board[x][i]
                    if target_pos == "#":
                        break
                    if target_pos == "." or target_pos == "-" or target_pos == "#":
                        continue
                    if target_pos == "<" or target_pos == ">" or target_pos == "^" or target_pos == "v":
                        continue
                    board[x][i] = "."
                    break
            elif cur_pos == "<":
                for i in range(y+1):
                    target_pos = board[x][y-i]
                    # print(i,target_pos)
                    if target_pos == "#":
                        break
                    if target_pos == "." or target_pos == "-":
                        continue
                    if target_pos == "<" or target_pos == ">" or target_pos == "^" or target_pos == "v":
                        continue
                    board[x][y-i] = '.'
                    break
            elif cur_pos == "^":
                for i in range(x+1):
                    target_pos = board[x-i][y]
                    if target_pos == "#":
                        break
                    if target_pos == "." or target_pos == "-" or target_pos == "#":
                        continue
                    if target_pos == "<" or target_pos == ">" or target_pos == "^" or target_pos == "v":
                        continue
                    board[x-i][y] = "."
                    break
            elif cur_pos == "v":
                for i in range(x,H):
                    target_pos = board[i][y]
                    if target_pos == "#":
                        break
                    if target_pos == "." or target_pos == "-" or target_pos == "#":
                        continue
                    if target_pos == "<" or target_pos == ">" or target_pos == "^" or target_pos == "v":
                        continue
                    board[i][y] = "."
                    break
    print(f'#{test_case}',end=" ")
    for i in board:
        print("".join(i))