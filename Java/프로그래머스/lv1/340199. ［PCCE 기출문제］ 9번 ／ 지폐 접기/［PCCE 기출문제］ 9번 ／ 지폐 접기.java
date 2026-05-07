import java.util.Arrays;

class Solution {
    public int solution(int[] wallet, int[] bill) {
		int answer = 0;
		
		while(true) {
			int wallet_min = Arrays.stream(wallet).min().getAsInt();
			int bill_min = Arrays.stream(bill).min().getAsInt();
			int wallet_max = Arrays.stream(wallet).max().getAsInt();
			int bill_max = Arrays.stream(bill).max().getAsInt();
			
			if(bill_min > wallet_min || bill_max > wallet_max) {
				
			}
			else break;
			
			if(bill[0] > bill[1]) 
				bill[0] /= 2;
			else
				bill[1] /= 2;
			
			answer++;
		}
		
		
		return answer;
    }
}