class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for(String b : babbling) {
            
            if(b.contains("ayaaya") || b.contains("yeye") || b.contains("woowoo") || b.contains("mama")) {
                continue;
            }
            
            
            b = b.replaceAll("aya", " ")
             .replaceAll("ye", " ")
             .replaceAll("woo", " ")
             .replaceAll("ma", " ");
            
            if(b.trim().length() == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}