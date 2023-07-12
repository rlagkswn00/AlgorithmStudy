#
# Title: BOJ 4949 균형잡인 세상
# Theory : 
# Date: 23.07.12
#
import sys
input = sys.stdin.readline

while True:
    str = input().rstrip()
    
    if str == ".":
        break
    else:
        isPrint = False
        st = []
        for c in str:
            if c == '[':
                st.append('[')
            if c == '(':
                st.append('(')
            if c == ']':
                # 스택이 비어있으면
                if not st or st[-1] != '[':
                    print("no")
                    isPrint = True
                    break
                else:
                    st.pop()
                

            if c == ')':
                if not st or st[-1] != '(':
                    print("no")
                    isPrint = True
                    break
                else:
                    st.pop()
            else:
                continue 
    if st and not isPrint:
        print("no")
    elif not isPrint:
        print("yes")