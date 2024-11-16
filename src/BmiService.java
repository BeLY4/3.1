public class BmiService {
    public int calculate(double weight, double height) {
        double bmiIndex = weight / Math.pow(height, 2);
        return (int) bmiIndex;
    }
}