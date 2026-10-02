import java.util.Scanner;

public class Task01 {

    static void main(String[] args) {
        double TAX_RATE = 1.05;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the Price before tax (Must be a Double): ");
        double input = scanner.nextDouble();

        double finalPrice = input * TAX_RATE;
        System.out.println("Your Price with Tax is: " + finalPrice);

    }

}
