public class SkiResortsEasy {
    public int minCost(int[] altitude) {
    
        int cost = 0;
        int prev = altitude[0];
        
        for (int i : altitude) {
            if (i > prev) {
            	cost += i - prev;
            } else {
            	prev = i;
            }       
        }
        return cost;
    }
}
