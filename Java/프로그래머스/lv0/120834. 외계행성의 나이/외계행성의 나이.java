class Solution {
    public String solution(int age) {
        char[] arr = String.valueOf(age).toCharArray();
        char[] ages = new char[arr.length];
        for(int i = 0; i < arr.length; i++) {
            char c = arr[i];
            
            switch(c) {
                case '0' : ages[i] = 'a';
                    break;
                case '1' : ages[i] = 'b';
                    break;
                case '2' : ages[i] = 'c';
                    break;
                case '3' : ages[i] = 'd';
                    break;
                case '4' : ages[i] = 'e';
                    break;
                case '5' : ages[i] = 'f';
                    break;
                case '6' : ages[i] = 'g';
                    break;
                case '7' : ages[i] = 'h';
                    break;
                case '8' : ages[i] = 'i';
                    break;
                case '9' : ages[i] = 'j';
                    break;
            }
        }
        
        String answer = String.valueOf(ages);
        return answer;
    }
}