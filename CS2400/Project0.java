package CS2400;
import java.util.Scanner;
public class Project0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Calculator.");
        while (true){
            System.out.println("Enter 'a' to add, 's' to subtract, 'm' to multiply, 'd' to divide, or 'q' to quit: ");
            
            String userInput = scanner.nextLine();
            
            if (userInput.equals("a")){
                add(scanner);
            } else if (userInput.equals("s")){
                subtract(scanner);
            } else if (userInput.equals("m")){
                    multiply(scanner);
            } else if (userInput.equals("d")){
                    divide(scanner);
            } else if (userInput.equals("q")){
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid input, try again.");
            }

        }
       
        scanner.close();

    }

    public static void add(Scanner scanner){
    System.out.println("Enter the first number: ");
    int numberOne = scanner.nextInt();

    System.out.println("Enter the second number: ");
    int numberTwo = scanner.nextInt();

    int sum = numberOne + numberTwo;
    System.out.println("The sum is " + sum);
    scanner.nextLine();

    }

    public static void subtract(Scanner scanner){
        System.out.println("Enter the first number: ");
        int numberOne = scanner.nextInt();
    
        System.out.println("Enter the second number: ");
        int numberTwo = scanner.nextInt();
    
        int difference = numberOne - numberTwo;
        System.out.println("The difference is " + difference);
        scanner.nextLine();
    
        }

    public static void multiply(Scanner scanner){
        System.out.println("Enter the first number: ");
        int numberOne = scanner.nextInt();
    
        System.out.println("Enter the second number: ");
        int numberTwo = scanner.nextInt();
    
        int product = numberOne * numberTwo;
        System.out.println("The product is " + product);
        scanner.nextLine();
    }

    public static void divide(Scanner scanner){
        System.out.println("Enter the first number: ");
        int numberOne = scanner.nextInt();
    
        System.out.println("Enter the second number: ");
        int numberTwo = scanner.nextInt();
    
        int quotient = numberOne / numberTwo;
        System.out.println("The quotient is " + quotient);
        scanner.nextLine();
    }

}
