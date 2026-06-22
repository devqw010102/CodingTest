from collections import Counter

def solution(want, number, discount) :    
    result = 0
    want_dict = Counter(dict(zip(want, number)))

    for i in range(len(discount) - 9) :
        window = Counter(discount[i : i + 10])

        if all(window[item] >= want_dict[item] for item in want_dict) :
            result += 1
    
    return result