class Solution {
    public int solution(int price) {
        int answer = price;
        
        
        if(price < 100000)
            return answer;
        else if(price < 300000) 
            return (int)(answer - (answer * 0.05));
        else if(price < 500000)
            return (int)(answer - (answer * 0.1));
        else 
            return (int)(answer - (answer * 0.2));
    }
}