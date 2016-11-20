public class AverageRating {
    public double calculate(int n1, int n2, int n3, int n4, int n5) {
        double sum =  1*n1 + 2*n2 + 3*n3 + 4*n4 + 5*n5;
        double votes = n1 + n2 + n3 + n4 + n5;
        return sum/votes;
    }
}