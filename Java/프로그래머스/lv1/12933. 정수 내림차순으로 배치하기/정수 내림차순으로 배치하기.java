import java.util.*;

class Solution {
    public long solution(long n) {       
        String[] str = Long.toString(n).split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        String answ = "";
        for(String s : str) {
            answ += s;
        }
        
        return Long.parseLong(answ);
    }
}