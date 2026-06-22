def solution(id_pw, db):
    
    user_dict = {user[0] : user[1] for user in db }
    id = id_pw[0]
    pw = id_pw[1]
    
    if id in user_dict :
        if user_dict[id] == pw :
            return "login"
        else :
            return "wrong pw"
    else :
        return "fail"