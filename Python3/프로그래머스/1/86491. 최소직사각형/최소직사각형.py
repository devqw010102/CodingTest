def solution(sizes):
    answer = 0
    
    maxX = -1
    maxY = -1
    
    for size in sizes:
        w = max(size)
        h = min(size)
        
        if w > maxX: maxX = w
        if h > maxY: maxY = h
        
    return maxX * maxY