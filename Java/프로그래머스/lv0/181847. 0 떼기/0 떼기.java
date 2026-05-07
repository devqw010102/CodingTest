class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        while(n_str.charAt(0) == '0') {
            n_str = n_str.substring(1);
        }
        answer = n_str;
        
        return answer;
    }
}