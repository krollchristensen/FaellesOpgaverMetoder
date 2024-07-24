public class SquareCalculator {
    public static void main(String[] args) {
        int number = 5;
        printSquare(number);
    }

    public static void printSquare(int number) {
        int square = number * number;
        System.out.println("Kvadratet af " + number + " er: " + square);
    }
}
