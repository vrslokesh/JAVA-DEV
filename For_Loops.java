public class For_Loops {
    public static void main(String[] args) {
        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            double intrestAmount = calculateIntrest(100.00, rate);
            System.out.println("The intrest rate is" + rate + "The intrested amount" + intrestAmount);
        }
    }

    public static double calculateIntrest(double amount, double intrestRate) {
        return (amount * (intrestRate / 100));
    }
}
