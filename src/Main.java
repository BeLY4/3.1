public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 105;
        double height = 1.79;
        int bmiIndex = service.calculate(weight, height);
        System.out.println("Индекс массы тела:" + bmiIndex);
    }
}