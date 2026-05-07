import java.util.Arrays;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        boolean[] flag = new boolean[schedules.length];
        Arrays.fill(flag, true);
        
        int[] deadline = new int[schedules.length];
        for(int i = 0; i < deadline.length; i++) {
            deadline[i] = schedules[i] + 10;
            if(deadline[i] % 100 >= 60) {
                deadline[i] = deadline[i] - 60 + 100;
            }
        }
        
        for(int i = 0; i < 7; i++) {
            
            int currentday = (startday + i - 1) % 7 + 1;
            if(currentday == 6 || currentday == 7) 
	            continue;
            
            for(int j = 0; j < schedules.length; j++) {
                if(!flag[j])
                    continue;
                
                if(timelogs[j][i] > deadline[j]) {
                    flag[j] = false;
                    continue;
                }
                    
            }  
        }
        for(boolean f : flag){
            if(f)
                answer++;
        }
        
        return answer;
    }
}