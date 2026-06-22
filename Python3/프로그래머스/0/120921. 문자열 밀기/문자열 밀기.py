def solution(A, B):
    result = 0
    
    for i in range(len(A)) :
        if A == B : break
        
        result += 1
        A = A[-1] + A[: -1]
        
        
        
    if result == len(A) : return -1
    else: 
        return result