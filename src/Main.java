public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weghtinKg = 65;
        int hightinM = (int) 1.65;
        double index = (int) service.calculate(weghtinKg, hightinM);
        System.out.println("Индекс массы тела = " + Math.round(index));
    }
}
