public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        String retString = "";
        for (int r : rights)
            retString += r >= minPermission ? "A" : "D";
        return retString;    	
    }
}