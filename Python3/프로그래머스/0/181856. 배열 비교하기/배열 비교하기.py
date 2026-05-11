def solution(arr1, arr2):
    if len(arr1) != len(arr2) :
        return -1 if len(arr2) > len(arr1) else 1
    else :
        if sum(arr1) == sum(arr2) : return 0
        else :
            return -1 if sum(arr2) > sum(arr1) else 1