import java.util.*;

public class NumberMagicEasy {
    public int theNumber(String answer) {
        HashMap<Integer, Boolean> possibilities = new HashMap<Integer, Boolean>();
        int[][] cards = new int[][] {
        	{1, 2, 3, 4, 5, 6, 7, 8}, 
    	    {1, 2, 3, 4, 9, 10, 11, 12}, 
	        {1, 2, 5, 6, 9, 10, 13, 14},  
        	{1, 3, 5, 7, 9, 11, 13, 15}
            }; 


        boolean[] boolAnswer = new boolean[4];
        int i = 0;
        for (char c : answer.toCharArray()) {
        	boolAnswer[i] = (c == 'Y') ? true : false;
            i++;
        }
        i = 0;
        for (boolean b : boolAnswer) {
            for (int j : cards[i]) {
            	if (possibilities.get(j) == null || possibilities.get(j) == true) possibilities.put(j, b);
            }
            i++;
        }
        for (Map.Entry<Integer, Boolean> results : possibilities.entrySet()) {
        	if (results.getValue()) return results.getKey(); 
        }
        return 16;    
    }
}