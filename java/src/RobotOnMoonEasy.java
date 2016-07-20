//	.....
//	.###.
//	..S#.
//	...#.
    
public class RobotOnMoonEasy {
	public String isSafeCommand(String[] board, String S) {
    
    	int x = -1;
        int y = -1;
    	for (int i = 0; i < board.length; i++) {
        	if (board[i].contains("S")) {
                y = i;
                x = board[i].indexOf("S");
            }
        }
    	char[] sA = S.toCharArray();
        for (char c : sA) {
        switch (c) {
        	case 'D': 
            	if (y + 1 > board.length - 1) return "Dead";
            	if (board[y+1].charAt(x) == '.') y++;
            	break;
            case 'U':
            	if (y - 1 < 0) return "Dead";
            	if (board[y-1].charAt(x) == '.') y--;
            	break;
            case 'L':
            	if (x - 1 < 0) return "Dead";
            	if (board[y].charAt(x-1) == '.') x--;
            	break;
            case 'R':
        	if (x + 1 > board[0].length() - 1) return "Dead";
            	if (board[y].charAt(x+1) == '.') x++;
            	break;
        } 
        }
    	return "Alive";
    }
}
