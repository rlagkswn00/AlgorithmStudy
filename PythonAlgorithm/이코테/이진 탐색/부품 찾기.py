#
# Title: 부품 찾기
# Date: 24.01.17
#
import sys
input = sys.stdin.readline


def binary_search(array, target, start, end):
    while start <= end:
        mid = (start + end)//2
        if array[mid] == target:
            return array[mid]
        if array[mid] < target:
            start = mid + 1
        if array[mid] > target:
            end = mid - 1
        return None


N = int(input())
product_num = list(map(int, input().split()))
product_num.sort()

M = int(input())
target_num = list(map(int, input().split()))

for i in target_num:
    result = binary_search(product_num, i, 0, N-1)
    if result:
        print("yes", end=' ')
    if result is None:
        print("no", end=' ')
