def solution(N, stages) :    
    fail = {}
    total = len(stages)

    for i in range(1, N + 1) :
        stuck = stages.count(i)
        if total == 0 :
            fail[i] = 0
        else :
            fail[i] = stuck / total
        total -= stuck
    return sorted(fail, key = lambda x: fail[x], reverse = True)
