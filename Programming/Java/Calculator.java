import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        int choice;
        do {
            System.out.println("Enter your choice:\n 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n\n 0. Exit :(");
            choice = in.nextInt();

            switch (choice) {
                case 0 -> System.out.println("You made a total of " + counter + " calculations!");

                case 1 -> {
                    System.out.print("Enter the 2 numbers you want to add: ");
                    int num1, num2;
                    num1 = in.nextInt();
                    num2 = in.nextInt();
                    System.out.println("The sum is: " + (num1 + num2));
                }

                case 2 -> {
                    System.out.print("Enter the 2 numbers you want to subtract: ");
                    int num1 = in.nextInt();
                    int num2 = in.nextInt();
                    System.out.println("The sum is: " + (num1 - num2));
                }

                case 3 -> {
                    System.out.print("Enter the 2 numbers you want to multiply: ");
                    int num1 = in.nextInt();
                    int num2 = in.nextInt();
                    System.out.println("The sum is: " + (num1 * num2));
                }

                case 4 -> {
                    System.out.print("Enter the 2 numbers you want to divide: ");
                    int num1 = in.nextInt();
                    int num2 = in.nextInt();
                    System.out.println("The sum is: " + (num1 / num2));
                }

                default -> System.out.println("Invalid input");
            }
            counter++;
        } while(choice != 0);

        in.close();
    }
}