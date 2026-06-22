def solution(n) :
    result = 0
    
    while True :
        if n == 0 : break
        
        if n % 2 == 0 :
            n //= 2
            continue
        else :
            n -= 1
            result += 1
        
    return result