def solution(a, b, c):
    sum1 = a + b + c
    sum2 = a ** 2 + b ** 2 + c ** 2
    sum3 = a ** 3 + b ** 3 + c ** 3
    
    if a == b == c :
        return sum1 * sum2 * sum3
    elif a != b and b != c and a != c :
        return sum1
    else :
        return sum1 * sum2