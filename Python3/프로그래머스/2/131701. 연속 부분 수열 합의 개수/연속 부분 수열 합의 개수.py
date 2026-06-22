def solution(elements) :    

    n = len(elements)
    doubled = elements + elements
    sums = set()

    for length in range(1, n + 1) :
        for i in range(n) :
            sums.add(sum(doubled[i : i + length]))
   
    return len(sums)