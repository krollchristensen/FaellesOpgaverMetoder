public class SumCalculator {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;
        printSum(num1, num2);
    }

    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Summen af " + a + " og " + b + " er: " + sum);
    }
}
