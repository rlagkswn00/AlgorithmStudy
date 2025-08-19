import sys
input = sys.stdin.readline

def binarySearch(number):
    global twos
    start = 0
    end = len(twos) - 1
    while start <= end:
        mid = (start + end) // 2
        #오른쪽으로 이동해야함.
        if twos[mid] == number:
            return True
        elif twos[mid] < number:
            start = mid+1
        else:
            end = mid-1
    return False
    

n = int(input())
nums = [int(input()) for _ in range(n)] #n

nums.sort() # nlogn

twos = set()

result = -sys.maxsize

#n^2
for i in nums:
    for j in nums:
        twos.add(i+j)
        
twos = sorted(list(twos))
#n^2 * nlogn
for l in nums:
    for j in nums:
        temp = l - j
        if temp <= 0:
            continue
        if binarySearch(temp):
            result = max(result,temp + j)
            
print(result)