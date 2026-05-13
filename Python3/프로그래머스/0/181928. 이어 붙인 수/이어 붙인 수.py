def solution(num_list):
    even = [str(n) for n in num_list if n % 2 == 0]
    odd = [str(n) for n in num_list if n % 2 == 1]
    
    return int("".join(even)) + int("".join(odd))