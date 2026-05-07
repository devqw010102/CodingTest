import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        
        int[] answer = new int[emergency.length];
        int[] arr = new int[emergency.length];
    
        for(int i = 0; i < arr.length; i++) {
            arr[i] = emergency[i];
        }
        Arrays.sort(arr);
        
        int count = arr.length;
        
        for(int i = 0; i < answer.length; i++) {
            for(int j = 0; j < emergency.length; j++) {
                if(arr[j] == emergency[i]) {
                    answer[j] = count--;
                }
            }
        }
        return answer;
    }
}