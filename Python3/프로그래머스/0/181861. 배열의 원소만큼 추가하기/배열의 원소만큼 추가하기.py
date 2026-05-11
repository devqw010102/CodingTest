def solution(arr):
    answer = []
    for x in arr :
        for _ in range(x) :
            answer.append(x)
    return answer