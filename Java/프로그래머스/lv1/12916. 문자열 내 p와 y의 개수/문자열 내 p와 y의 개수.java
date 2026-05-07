class Solution {
    boolean solution(String s) {
        
        String str = s.toLowerCase();
        int a = 0;
        int b = 0;
        
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'p') {
                a++;
            }
            else if(str.charAt(i) == 'y'){
                b++;
            }
        }
        

        return a == b ? true : false;
    }
}