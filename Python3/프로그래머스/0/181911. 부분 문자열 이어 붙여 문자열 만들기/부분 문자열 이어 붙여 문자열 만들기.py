def solution(my_strings, parts):
    answer = ''
    index = 0
    for x, y in parts :
        answer += my_strings[index][x : y + 1]
        index += 1
    
    return answer