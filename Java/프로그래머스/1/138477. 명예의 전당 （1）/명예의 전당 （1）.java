import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int count = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int s : score) {
            list.add(s);
            Collections.sort(list);
            
            
            if(list.size() > k) {
                list.remove(0);
            }
            answer[count++] = list.get(0);
        }
        
        return answer;
    }
}