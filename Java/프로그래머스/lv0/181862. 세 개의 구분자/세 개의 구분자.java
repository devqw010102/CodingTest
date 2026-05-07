import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        
        myStr = myStr.replace("a", " ");
        myStr = myStr.replace("b", " ");
        myStr = myStr.replace("c", " ");
        
        
        String[] arr = myStr.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(!arr[i].equals(""))
                list.add(arr[i]);
        }
        
        String[] answer = new String[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return list.size() == 0 ? new String[]{"EMPTY"} : answer;
    }
}