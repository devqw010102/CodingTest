def solution(s, skip, index) :    
    result = []
    alphabet = "abcdefghijklmnopqrstuvwxyz"
    alpha_list = [c for c in alphabet if c not in skip]

    for char in s :
        idx = (alpha_list.index(char) + index) % len(alpha_list)
        result.append(alpha_list[idx])
    
    return "".join(result)