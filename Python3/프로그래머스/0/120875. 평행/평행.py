def solution(dots) :    
    a, b, c, d = dots
    
    def parallel(p1, p2, p3, p4):
        return (p2[1]-p1[1]) * (p4[0]-p3[0]) == (p4[1]-p3[1]) * (p2[0]-p1[0])
        
    dx1 = (dots[1][1] - dots[0][1]) * (dots[3][0] - dots[2][0])
    dx2 = (dots[3][1] - dots[2][1]) * (dots[1][0] - dots[0][0])

    if parallel(a, b, c, d): return 1
    if parallel(a, c, b, d): return 1
    if parallel(a, d, b, c): return 1

    return 0