def solution(num, total) :    
    result = []

    sum_diff = num * (num - 1) // 2
    start = (total - sum_diff) // num
   
    return [start + i for i in range(num)]
