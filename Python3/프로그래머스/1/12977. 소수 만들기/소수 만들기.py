from itertools import combinations
import math

def solution(nums) :    
    result = 0
    for combo in combinations(nums, 3) :
        if is_prime(sum(combo)) :
            result += 1
    return result

def is_prime(n) :
    if n < 2 :
        return False
    for i in range(2, int(math.sqrt(n)) + 1) :
        if n % i == 0:
            return False
    return True