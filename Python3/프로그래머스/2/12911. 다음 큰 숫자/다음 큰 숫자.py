def solution(n):
    nCount = bin(n).count('1')
    
    while True :
        n += 1
        if bin(n).count('1') == nCount :
            return n