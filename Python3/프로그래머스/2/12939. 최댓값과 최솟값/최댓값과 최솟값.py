def solution(s):
    strList = list(map(int, s.split(' ')))
    strList.sort()

    return str(strList[0]) + ' ' + str(strList[-1])
