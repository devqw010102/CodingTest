def solution(score):
    avg = [(sum(s) / len(s)) for s in score]
    sort_avg = sorted(avg, reverse = True)
    return [sort_avg.index(avg1) + 1 for avg1 in avg]
    