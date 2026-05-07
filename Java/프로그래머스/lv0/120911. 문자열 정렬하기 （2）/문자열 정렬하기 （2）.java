import java.util.*;

class Solution {
    public String solution(String my_string) {
        
        String lower_string = my_string.toLowerCase();
        char[] array = lower_string.toCharArray();
        Arrays.sort(array);
        
        String answer = String.valueOf(array);
        return answer;
    }
}