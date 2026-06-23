def solution(dartResult) :    

    bonus = ["S", "D", "T"]
    score = []

    i = 0
    while i < len(dartResult) :
        if dartResult[i].isdecimal() :
            if i + 1 < len(dartResult) and dartResult[i + 1].isdecimal() :
                num = int(dartResult[i : i + 2])
                i += 2
            else :
                num = int(dartResult[i])
                i += 1
        else :
            # 문자 처리
            if dartResult[i] in bonus :
                score.append(num ** (bonus.index(dartResult[i]) + 1))
            elif dartResult[i] == "*" :
                if len(score) >= 2 :
                    score[-2] *= 2
                score[-1] *= 2
            elif dartResult[i] == "#" :
                score[-1] *= -1
                
            i += 1
    
    return sum(score)