def solution(n) :    
    return len(find_primes(n))

def find_primes(n) :
    sieve = [True] * (n + 1)
    sieve[0] = False
    sieve[1] = False

    m = int(n ** 0.5) 
    for i in range(2, m + 1) :
        if sieve[i] :
            for j in range(i * i , n + 1, i) :
                sieve[j] = False
    return [i for i in range(2, n + 1) if sieve[i]]