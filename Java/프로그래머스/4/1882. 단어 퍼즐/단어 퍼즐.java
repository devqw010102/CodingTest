import java.util.*;

class Solution {
    public int solution(String[] strs, String t) {
        int answer = 0;

        int n = t.length();
        int dp[] = new int[n + 1];
        
        Arrays.fill(dp, 20001);
        dp[0] = 0;
        
        Set<String> dict = new HashSet<>(Arrays.asList(strs));

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 5 && i - j >= 0; j++) {
                String sub = t.substring(i - j, i);
                
                if(dict.contains(sub)) {
                    dp[i] = Math.min(dp[i], dp[i - j] + 1);
                }
            }
        }
        
        return dp[n] > 20000 ? -1 : dp[n];
    }
}