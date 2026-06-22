def solution(babbling) :    
    result = 0

    sounds = ["aya", "ye", "woo", "ma"]

    for bab in babbling :
        for s in sounds :
            bab = bab.replace(s, ' ', 1)

        if bab.strip() == '' and ' ' not in bab.strip() :
            result += 1
    
    return result