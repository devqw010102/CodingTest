class Solution {
    public String[] solution(String[] picture, int k) {
        
        String[] answer = new String[picture.length * k];
        int index = 0;
        for(int i = 0; i < picture.length; i++) {
            String str = picture[i];
            String temp = "";
            
            for(int j = 0; j < str.length(); j++) {
                
                for(int l = 0; l < k; l++) {
                    temp += str.charAt(j) + "";    
                }
            }
            
            for(int l = 0; l < k; l++) {
                answer[index++] = temp;    
            }   
        }
        
        return answer;
    }
}