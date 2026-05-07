class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        
        answer.append("0");
        for(int a = food.length - 1; a >= 0; a--) {
            // food[a] 가 짝수
            if(food[a] % 2 == 0) {
                for(int i = 0; i < food[a] / 2; i++) {
                    answer.insert(0, a);
                    answer.append(a);
                }
            }
            // food[a] 가 홀수이고, 3 이상일 때
            else if(food[a] % 2 == 1 && food[a] / 2 != 0) {
                for(int i = 0; i < food[a] / 2; i++) {
                    answer.insert(0, a);
                    answer.append(a);
                }
            }
        }
        
        return String.valueOf(answer);
    }
}