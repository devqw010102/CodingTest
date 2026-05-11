class Solution {
    public String solution(String letter) {
        String answer = "";
        String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String input[] = letter.split(" ");
        
        for(String str : input) {
            for(int i = 0; i < morse.length; i++) {
                if(str.equals(morse[i])) {
                    answer += (char)('a' + i);
                }
            }
        }
        return answer;
    }
}