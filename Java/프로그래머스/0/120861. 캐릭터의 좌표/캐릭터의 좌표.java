class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        
        int limitX = board[0] / 2;
        int limitY = board[1] / 2;

        for(String key : keyinput) {
            switch(key) {
                case "left":
                    if (x - 1 >= -limitX) x--;
                    break;
                case "right":
                    if (x + 1 <= limitX) x++;
                    break;
                case "up":
                    if (y + 1 <= limitY) y++;
                    break;
                case "down":
                    if (y - 1 >= -limitY) y--;
                    break;
            }
        }

        return new int[] {x, y};
    }
}
