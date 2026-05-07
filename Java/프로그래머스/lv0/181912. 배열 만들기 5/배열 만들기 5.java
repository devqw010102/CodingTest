import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        int[] temp = new int[intStrs.length];
        int count = 0;
        
        for(String str : intStrs) {
            int num = Integer.parseInt(str.substring(s, s + l));
            
            if(num > k) {
                temp[count++] = num;
            }
        }
        return Arrays.copyOf(temp, count);
    }
}