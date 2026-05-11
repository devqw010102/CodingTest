import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map.keySet().stream()
            .filter(key -> map.get(key) == 1)
            .sorted()
            .map(String :: valueOf)
            .collect(Collectors.joining());
    }
}