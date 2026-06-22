def solution(chicken):
    result = 0
    coupon = chicken
    
    while coupon >= 10 :
        service = coupon // 10
        result += service
        coupon = service + (coupon % 10)
    
    return result
