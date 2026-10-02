import java.util.Scanner;

public class Task04 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Number: ");
        int input = scanner.nextInt();

        if (input % 2 == 1) {
            System.out.println("Your Number is Odd");
        }
        else {
            System.out.println("Your Number is Even");
        }

    }
}
