def solution(quiz) :    

    result = []
    
    for q in quiz :
        list = q.split(' ')
        if list[1] == '-' :
            num = int(list[0]) - int(list[2])
        elif list[1] == '+' :
            num = int(list[0]) + int(list[2])
        
        if num == int(list[-1]) :
            result.append("O")
        else :
            result.append("X")
    
    return result