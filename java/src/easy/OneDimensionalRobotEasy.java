public class OneDimensionalRobotEasy {
    public int finalPosition(String cmds, int A, int B) {
    	int pos = 0;
        for (char c : cmds.toCharArray()) {
        	if (c == 'R' && pos < B) pos++;
			if (c == 'L' && pos > -A) pos--;        
        }        
        return pos;
    }    
}