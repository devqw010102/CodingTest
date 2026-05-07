class Solution {
    public int solution(int n, int w, int num) {
        		int answer = 0;
		
		// index 기준
		int startLine = (num - 1) / w;	// 시작 줄
		int lo = 0;			// 시작 칸

		// 시작 칸
		if(startLine % 2 == 0) {	// 짝수 줄
			lo = (num - 1) % w;
		}
		else {						// 홀수 줄
			lo = (w - 1) - ((num - 1) % w);
		}
		
		int lastLine = (n - 1) / w;	// 마지막 줄
		
		answer = lastLine - startLine + 1; 

        if (n % w != 0) { // 마지막 줄 빈 곳 있을 때
            int lastBoxLo; // 마지막 박스의 칸 위치
            
            if ((n / w) % 2 == 0) { // 짝수줄, 정방향
                lastBoxLo = (n - 1) % w;
                // 마지막 박스가 왼쪽에 있으면 위에 없음
                if (lo > lastBoxLo) {
                    answer--;
                }
            } 
            else { // 홀수줄, 역방향
                lastBoxLo = (w - 1) - ((n - 1) % w);
                // 마지막박스가 오른쪽에 있으면 위에 없음
                if (lo < lastBoxLo) {
                    answer--;
                }
            }
        }
        return answer;
    }
}