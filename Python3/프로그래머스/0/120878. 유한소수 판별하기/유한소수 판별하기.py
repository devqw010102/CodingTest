import math

def solution(a, b) :
    return is_finite_decimal(a, b)

def is_finite_decimal(a, b) :
    b //= math.gcd(a, b)

    while b % 2 == 0 :
        b //= 2

    while b % 5 == 0 :
        b //= 5

    return 1 if b == 1 else 2