def solution(s):
    words = s.split(' ')
    jaden_words = [w.capitalize() for w in words]
    return ' '.join(jaden_words)
