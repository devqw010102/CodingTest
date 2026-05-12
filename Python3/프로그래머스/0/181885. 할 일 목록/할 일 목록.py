def solution(todo_list, finished):
    return [task for task, f in zip(todo_list, finished) if not f]