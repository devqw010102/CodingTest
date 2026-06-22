def solution(board) :    
    result = 0
    n = len(board)

    dx = [-1, -1, -1, 0, 0, 1, 1, 1]
    dy = [-1, 0, 1, -1, 1, -1, 0, 1]

    danger_board = [[0] * n for _ in range(n)]

    for i in range(n) :
        for j in range(n) :
            if board[i][j] == 1:
                danger_board[i][j] = 1
                for k in range(8) :
                    nx = i + dx[k]
                    ny = j + dy[k]

                    if 0 <= nx < n and 0 <= ny < n :
                        danger_board[nx][ny] = 1

    for i in range(n) :
        for j in range(n) :
            if danger_board[i][j] == 0 :
                result += 1
    return result