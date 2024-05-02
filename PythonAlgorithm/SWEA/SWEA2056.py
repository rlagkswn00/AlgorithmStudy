#
# Title: SWEA 2056 연월일 달력
# Date: 24.05.02
#

T = int(input())
days31 = [1,3,5,7,8,10,12]
days30 = [4,6,9,11]
days28 = [2]
for test_case in range(1, T + 1):
    result = "#" + str(test_case) + " "
    input_date = input()
    
    if len(input_date) != 8:
        result += str(-1)
        print(result)
        continue
    
    year = int(input_date[0:4])
    month = int(input_date[4:6])
    day = int(input_date[6:8])
    if month > 12 or month < 1:
        result += str(-1)
        print(result)
        continue
    if month in days31 and day > 30 or day < 1:
        result += str(-1)
        print(result)
        continue
    if month in days30 and day > 31 or day < 1:
        result += str(-1)
        print(result)
        continue
    if month in days28 and day > 28 or day < 1:
        result += str(-1)
        print(result)
        continue
    result += input_date[0:4]+ "/" + input_date[4:6] + "/" + input_date[6:8]
    print(result)