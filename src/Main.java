public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double imt = service.calculate(190, 84 );
        int bmi = (int)imt;

        System.out.println("Ваш индекс массы тела: " + bmi);
    }
}