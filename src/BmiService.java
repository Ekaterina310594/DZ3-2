public class BmiService {

    public int calculate(double kgWeight, double mHeight) {
        double bmiIndex = kgWeight / (mHeight * mHeight);

        return (int) bmiIndex;
    }

}
