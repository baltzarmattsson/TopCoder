public class EasyHomework {
    public static String determineSign(int[] A) {
    	
        int negative = 0;
        
        for (int tmp : A) {
        	if (tmp == 0) return "ZERO";
            if (tmp < 0) negative++;
        }
        if ((negative > 0) && ((negative % 2) != 0)) 
			return "NEGATIVE";
        return "POSITIVE";
    }
}