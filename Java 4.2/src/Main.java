public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 78;
        double height = 1.84;
        int bmi = service.calculate(height, weight);
        System.out.printf(" При росте " + height + " м. и весе " + weight + " кг., индекс массы тела составит " + bmi);
    }
}