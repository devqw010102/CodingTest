class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        int[] arr = new int[right - left + 1];
        int[] num = new int[right - left + 1];
        int ga = left;
        for(int i = 0 ; i < num.length; i++) {
            num[i] = ga++;
        }
        int index = 0;
        
        for(int i = left; i <= right; i++) {
            
            int count = 0;
            
            for(int j = 1; j * j <= i; j++) {
                if(j * j == i)
                    count++;
                else if(i % j == 0) count += 2;
            }
            
            arr[index++] = count;
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
                answer += num[i];
            else 
                answer -= num[i];
            
        }
        
        return answer;
    }
}