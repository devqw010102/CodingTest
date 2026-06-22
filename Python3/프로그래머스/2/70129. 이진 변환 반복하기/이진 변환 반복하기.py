def solution(s):
    zeroSum = 0
    count = 0
    
    while True :
        if s == "1" : break
        
        zeroSum += s.count("0")
        s = s.replace("0", '')
        s = bin(len(s))[2:]
        
        count += 1

    return [count, zeroSum]