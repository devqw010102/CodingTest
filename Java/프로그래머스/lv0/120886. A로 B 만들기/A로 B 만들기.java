import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] bChar = before.toCharArray();
        char[] aChar = after.toCharArray();
        
        Arrays.sort(bChar);
        Arrays.sort(aChar);
        
        if(Arrays.equals(bChar, aChar))
            answer = 1;
        
        return answer;
    }
}