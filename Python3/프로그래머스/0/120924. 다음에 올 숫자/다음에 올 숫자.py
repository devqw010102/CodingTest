def solution(common) :    
    result = 0

    if (common[0] - common[1]) == (common[1] - common[2]) :
        # 등차 수열
        return (common[-1] + (common[1] - common[0]))
    elif (common[1] // common[0] == common[2] // common[1]) :
        # 등비 수열
        return common[-1] * (common[1] // common[0])
    return result