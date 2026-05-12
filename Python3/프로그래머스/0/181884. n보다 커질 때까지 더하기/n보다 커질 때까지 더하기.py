def solution(numbers, n):
    answer = 0
    
    for a in numbers :
        if answer > n : return answer
        answer += a
    
    return answer