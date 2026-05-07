class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int temp = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < array.length; i++) {
            temp = Math.abs(n - array[i]);
            
            if(temp < min) {
                min = temp;
                answer = array[i];
            }
            else if(temp == min && array[i] < answer) {
                answer = array[i];
            }
        }
        
        return answer;
    }
}