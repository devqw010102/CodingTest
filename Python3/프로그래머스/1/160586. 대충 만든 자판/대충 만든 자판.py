def solution(keymap, targets) :    
    result = []
    char_map = {}
    
    for key in keymap :
        for i, char in enumerate(key) :
            if char not in char_map :
                char_map[char] = i + 1
            else :
                char_map[char] = min(char_map[char], i + 1)
    
    for target in targets :
        total = 0
        for char in target :
            if char not in char_map :
                total = -1
                break
            total += char_map[char]
        result.append(total)
    
    return result