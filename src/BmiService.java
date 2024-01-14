public class BmiService {

    public double calculate(double weighIntKg, double heigtInM) {
        double heighIntMeters = 1.65;
        double bmi = weighIntKg / heighIntMeters / heighIntMeters;
        return (int) bmi;
    }
}
