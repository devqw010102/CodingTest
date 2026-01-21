def solution(new_id):
    answer = ''.join([c for c in new_id.lower() if c.isalnum() or c in "-_."])
    step3 = ''
    for char in answer :
        if char == '.' :
            if step3 and step3[-1] == '.' :
                continue
        step3 += char

    step3 = step3.strip('.')

    if step3 == '' :
        step3 += 'a'
    elif step3.__len__() >= 16 :
        step3 = step3[:15]
        if step3[-1] == '.' :
            step3 = step3[:-1]

    while len(step3) < 3 :
        step3 += step3[-1]

    return step3