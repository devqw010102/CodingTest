def solution(sides):
    sumVal = sum(sides)
    subVal = abs(sides[0] - sides[1])

    return sumVal - subVal - 1