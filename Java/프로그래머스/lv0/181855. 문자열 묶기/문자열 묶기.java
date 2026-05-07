import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        
        
        Map<Integer, Integer> group = new HashMap<>();
        
        for(String str : strArr) {
            int length = str.length();
            group.put(length, group.getOrDefault(length, 0) + 1);
        }
        
        int maxLength = 0;
        
        for(int num : group.values()) {
            if(num > maxLength) 
                maxLength = num;
        }
        
        
        return maxLength;
    }
}