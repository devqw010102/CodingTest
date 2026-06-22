import math
from functools import reduce

def solution(n) :
    lcm = lambda a, b : (a * b) // math.gcd(a, b)

    return reduce(lcm, n)