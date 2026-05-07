def solution(a, b, n):
    answer = 0

    while n >= a:
        new =  (n // a) * b
        remain = n % a

        answer += new
        n = new + remain
    return answer