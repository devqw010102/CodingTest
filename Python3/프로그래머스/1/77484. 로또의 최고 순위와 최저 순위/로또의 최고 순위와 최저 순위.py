def solution(lottos, win_nums) :    
    rank = [6, 6, 5, 4, 3, 2, 1]
    
    match_count = 0
    for my_num in lottos :
        if my_num != 0 :
            for win in win_nums :
                if my_num == win :
                    match_count += 1
                    break
            
    zero_count = lottos.count(0)

    best = rank[match_count + zero_count]
    worst = rank[match_count]
    
    return [best, worst]