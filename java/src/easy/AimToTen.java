public class AimToTen {

	public int need(int[] marks) {
		double sum = 0;
		for (int i : marks) 
			sum += i;		

		if (sum/marks.length >= 9.5)
			return 0;

		for (int times = 1; true; times++) 
			if ((sum + 10 * times) / (marks.length + times) >= 9.5)
				return times;
	}

}