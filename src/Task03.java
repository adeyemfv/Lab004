public class Task03 {
    static void main(String[] args) {

        int principal = 5000;
        double interestRate = 0.17;

        double firstMonth = principal * interestRate;
        System.out.println("Your balance after a month is:" + firstMonth);

        double secondMonth = (principal + firstMonth) * interestRate;
        System.out.println("Your balance after two months is: " + secondMonth);


    }
}
