public class BmiService {

    public double calculate(double rostCm, double vesKg) {

        double bmi = vesKg / ((rostCm / 100) * (rostCm / 100));

        return bmi;
    }
}
