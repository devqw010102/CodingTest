def solution(number, limit, power):
    answer = 0
    count = knight_number(number)

    for i in count :
        answer += power if i > limit else i
    return answer

def knight_number(n) :
    count = [0] * (n + 1)

    for i in range(1, n + 1) :
        for j in range(i, n + 1, i) :
            count[j] += 1
    return count[1:]
