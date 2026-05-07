class Solution {
    public String[] solution(String[] names) {
        
        int temp = 0;
        if(names.length % 5 == 0) {
            temp = names.length / 5;
        }
        else {
            temp = names.length / 5 + 1;
        }
        
        // names.length % 5 == 0 ? temp = names.length / 5 : temp = names.length / 5 + 1;
        String[] answer = new String[temp];
        
        temp = 0;
        for(int i = 0; i < names.length; i++) {
            if(i % 5 == 0) {
                answer[temp++] = names[i];
            }
        }
        
        return answer;
    }
}