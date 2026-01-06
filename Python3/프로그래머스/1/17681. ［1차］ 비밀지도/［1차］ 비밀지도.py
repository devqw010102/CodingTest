def solution(n, arr1, arr2):
    answer = []
    for i in range(n):
        combined = arr1[i] | arr2[i]

        binary_row = bin(combined)[2:].zfill(n)
        row_string = binary_row.replace('1', '#').replace('0', ' ')
        answer.append(row_string)
        
    return answer