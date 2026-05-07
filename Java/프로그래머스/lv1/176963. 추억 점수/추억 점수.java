import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        int[] answer = new int[photo.length];
        
        for(int i = 0; i < photo.length; i++) {
            for(int j = 0; j < photo[i].length; j++) {
                String str = photo[i][j];
                
                int index = Arrays.asList(name).indexOf(str);
                if(index != -1) {
                    answer[i] += yearning[index];
                }
            }
        }
        
        return answer;
    }
}
