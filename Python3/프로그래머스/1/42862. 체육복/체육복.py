def solution(n, lost, reserve) :    
    result = 0

    setLost = set(lost)
    setReserve = set(reserve)
    both = setLost & setReserve
    setLost -= both
    setReserve -= both

    for r in sorted(setReserve) :
        if (r - 1) in setLost :
            setLost.remove(r - 1)
        elif (r + 1) in setLost :
            setLost.remove(r + 1)
        
    return n - len(setLost)