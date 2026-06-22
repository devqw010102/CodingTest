def solution(lines) :    
    result = 0

    maxValue = max(map(max, lines))
    minValue = min(map(min, lines))

    for i in range(minValue, maxValue) :
        count = 0
        for line in lines :
            if line[0] <= i and i + 1 <= line[1] :
                count += 1
        if count >= 2:
            result += 1
    
    return result