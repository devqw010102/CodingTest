def solution(myString, pat):
    converted = "".join(["B" if char == 'A' else 'A' for char in myString])
    return 1 if pat in converted else 0