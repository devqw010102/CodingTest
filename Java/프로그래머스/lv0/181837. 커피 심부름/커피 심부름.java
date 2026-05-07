class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        int americano = 0;
        int cafelatte = 0;
        int anything = 0;
        
        for(int i = 0; i < order.length; i++) {
            if(order[i].contains("americano")) {
                americano++;
            }
            else if(order[i].contains("cafelatte")) {
                cafelatte++;
            }
            else if(order[i].contains("anything")) {
                americano++;
            }   
        }
        
        return americano * 4500 + cafelatte * 5000;
    }
}