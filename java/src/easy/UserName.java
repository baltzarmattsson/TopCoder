public class UserName {
	public String newMember(String[] existingNames, String newName) {
	    
        if (alreadyExists(existingNames, newName) == false) 
        	return newName;

        for (int i = 1; true; i++) 
            if (!alreadyExists(existingNames, newName+i)) 
            	return newName+i;
	}

	private boolean alreadyExists(String[] existingNames, String newName) {

		boolean alreadyExists = false;
		if (IntStream.of(existingNames).anyMatch(x -> x.equals(newName)))
			alreadyExists = true;

		return alreadyExists;
	}
}