import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < flag.length; i++) {
            if(flag[i]) {
                for(int x = 0; x < arr[i] * 2; x++) {
                    list.add(arr[i]);
                }
            }
            else {
                for(int x = 0; x < arr[i]; x++) {
                    list.remove(list.size() - 1);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}