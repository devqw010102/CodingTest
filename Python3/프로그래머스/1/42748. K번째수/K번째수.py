def solution(array, commands):
    answer = []
    for com in commands:
        i, j, k = com
    
        copyArr = array[i - 1 : j]
        copyArr.sort()
        
        answer.append(copyArr[k - 1])
        
    return answer