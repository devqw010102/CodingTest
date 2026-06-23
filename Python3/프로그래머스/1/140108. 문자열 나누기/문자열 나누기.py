def solution(s) :    
    result = 0

    x = s[0]
    x_count, other_count = 0, 0
    
    for i, char in enumerate(s) :
        if char == x :
            x_count += 1
        else :
            other_count += 1

        if x_count == other_count :
            result += 1
            x_count = 0
            other_count = 0
            if i + 1 < len(s) :
                x = s[i + 1]

    if x_count != 0 or other_count != 0 :
        result += 1
    
    return result