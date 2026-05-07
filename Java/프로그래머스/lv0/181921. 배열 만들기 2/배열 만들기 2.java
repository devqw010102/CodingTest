import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        
        String num = "";
        int count = 0;
        
        for(int i = l; i <= r; i++) {
            num = String.valueOf(i);
            count = 0;
            
            for(int j = 0; j < num.length(); j++) {
                if(num.charAt(j) == 48 || num.charAt(j) == 53) {
                    count++;
                }
            }
            
            if(num.length() == count) {
                list.add(i);
            }
            
        }
        if(list.size() == 0) {
            int[] answer = {-1};
            return answer;
        }
        else {
            int[] answer = new int[list.size()];    
            
            for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
            }
            return answer;
        }
    }
}