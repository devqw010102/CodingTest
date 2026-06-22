def solution(polynomial) :
    x_num = 0
    const_num = 0

    terms = polynomial.split(" + ")

    for term in terms :
        if 'x' in term :
            if term == 'x' :
                x_num += 1
            else :
                x_num += int(term.replace('x', ''))
        else :
            const_num += int(term)

    result = []
    if x_num > 0 :
        if x_num == 1 :
            result.append("x")
        else :
            result.append(f"{x_num}x")

    if const_num > 0 :
        result.append(f"{const_num}")

    return " + ".join(result) if result else "0"