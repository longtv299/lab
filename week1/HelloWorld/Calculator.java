import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = null;

        try {
            input = new Scanner(System.in);

            System.out.print("Enter first number: ");
            String strNum1 = input.nextLine();
            double num1 = Double.parseDouble(strNum1);

            System.out.print("Enter second number: ");
            String strNum2 = input.nextLine();
            double num2 = Double.parseDouble(strNum2);

            double sum = num1 + num2;
            double difference = num1 - num2;
            double product = num1 * num2;
            double quotient = 0;

            if (num2 != 0) {
                quotient = num1 / num2;
            } else {
                System.out.println("Cannot divide by zero.");
            }

            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);

        } finally {
            if (input != null) {
                input.close();
            }
        }

    }

}
