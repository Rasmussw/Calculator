import java.util.Scanner;

public class main {

    public static double multiplication() {
        System.out.println("Please enter first number to multiply:");
        Scanner scanner = new Scanner(System.in);
        Double firstNumber = scanner.nextDouble();
        System.out.println("Please enter second number to multiply:");
        Double secondNumber = scanner.nextDouble();
        Double result = firstNumber * secondNumber;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiplication());

    }
}
