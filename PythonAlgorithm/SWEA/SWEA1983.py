#
# Title: SWEA 1983 조교의 성적 매기기
# Date: 24.05.08
#

T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
gpa = ["A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"]
for test_case in range(1, T + 1):
    N, K = map(int,input().split())
    grades = []
    for i in range(N):
        mid, final, homework = map(int,input().split())
        total = mid * 0.35 + final * 0.45 + homework * 0.2
        grades.append((i+1,total))
    grades.sort(key = lambda x : (x[1]),reverse=True)
    rank = 0
    for i in grades:
        if i[0] == K:
            num_of_range = N//10
            range1 = int(rank / num_of_range)
            if range1 % 10 == 0:
                range1 += 1
            print("#" + str(test_case) + " " +gpa[range1])
            break
        rank+=1

