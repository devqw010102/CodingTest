class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for(char c : s.toCharArray()) {
            if(c == ' ') {
                answer.append(" ");
                continue;
            }
            
            int base = Character.isUpperCase(c) ? 'A' : 'a';
            int offset = (c - base + n) % 26;
            answer.append((char)(base + offset));
        }        
        
        return String.valueOf(answer);
    }
}