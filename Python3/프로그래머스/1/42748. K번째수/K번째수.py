def solution(array, commands):
    answer = []
    for com in commands:
        i = com[0]
        j = com[1]
        k = com[2]
        
        
        copyArr = array[i - 1 : j]
        copyArr.sort()
        
        answer.append(copyArr[k - 1])
        
    return answer