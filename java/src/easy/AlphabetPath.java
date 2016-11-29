public class AlphabetPath {
    public String doesItExist(String[] letterMaze) {
    
        // Finding starting coords
    	int x = 0, y = 0;
        for (int i = 0; i < letterMaze.length; i++) 
            for (int j = 0; j < letterMaze[i].length(); j++)
            if (letterMaze[i].charAt(j) == 'A') {
            	x = j;
                y = i;
            }
		// 65 = 'A', 90 = 'Z'
        char target;
		for (int i = 65; i <= 90; i++) {
            	target = (char) i;
            	if (y-1 >= 0 && letterMaze[y-1].charAt(x) == target)
                    y--;
            	else if (y+1 < letterMaze.length && letterMaze[y+1].charAt(x) == target)
                    y++;
                else if (x+1 < letterMaze[y].length() && letterMaze[y].charAt(x+1) == target)
                    x++;
                else if (x-1 > 0 && letterMaze[y].charAt(x-1) == target)
                    x--;
            	if (letterMaze[y].charAt(x) != target)
                    return "NO";
         }
       	return "YES";
    }	
}
