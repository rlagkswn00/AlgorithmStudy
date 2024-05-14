#
# Title: SWEA 11387 몬스터 사냥
# Date: 24.05.14
#

T = int(input())
for test_case in range(1, T + 1):
    D,L,N = map(int,input().split())
    percent = 1/100
    damage = 0

    for n in range(N):
        damage += D*(1+n*L*percent)
    print("#{} {}".format(test_case,int(damage)))