def solution(spell, dic):
    for word in dic :
        if all(s in word for s in spell) :
            return 1
    return 2