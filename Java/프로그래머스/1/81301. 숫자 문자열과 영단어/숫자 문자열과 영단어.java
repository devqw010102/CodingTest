class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String a = "";
        
        for(char c : s.toCharArray()) {
            if(c >= 48 && c <= 57) {
                sb.append(String.valueOf((char)c));
                continue;
            }
            
            a += String.valueOf(c);
            for(int i = 0; i < numbers.length; i++) {
                if(a.equals(numbers[i])) {
                    sb.append(String.valueOf(i));
                    a = "";
                }
            }            
        }
        return Integer.parseInt(String.valueOf(sb));
    }
}