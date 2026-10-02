import java.util.Scanner;

public class Task02 {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Spring Maintenance Cost:");
        double springCost = scanner.nextDouble();

        System.out.print("Input Summer Maintenance Cost:");
        double summerCost = scanner.nextDouble();

        System.out.print("Input Fall Maintenance Cost:");
        double fallCost = scanner.nextDouble();

        System.out.print("Input Winter Maintenance Cost:");
        double winterCost = scanner.nextDouble();

        System.out.println("Your Spring Cost was " + springCost);
        System.out.println("Your Summer Cost was " + summerCost);
        System.out.println("Your Fall Cost was " + fallCost);
        System.out.println("Your Winter Cost was " + winterCost);






    }
}
