def solution(n):
    result = 0
    
    for _ in range(n) :
        result += 1
        while '3' in str(result) or result % 3 == 0:
            result += 1
            
    return result