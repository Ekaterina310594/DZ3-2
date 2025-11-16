//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double kgWeight = 98;
        double mHeight = 1.87;

        int bmiIndex = service.calculate (kgWeight, mHeight);

        System.out.println("Индекс массы тела : " + bmiIndex);

    }
}