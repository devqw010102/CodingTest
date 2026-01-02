import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        Arrays.sort(strings, (s1, s2) -> {
            // 1. n번째 글자를 추출
            char c1 = s1.charAt(n);
            char c2 = s2.charAt(n);
            
            // 2. n번째 글자가 같다면 단어 전체를 사전순으로 비교
            if (c1 == c2) {
                return s1.compareTo(s2);
            }
            
            // 3. 다르다면 n번째 글자 기준으로 비교
            return Character.compare(c1, c2);
        });
        
        return strings;
    }
}