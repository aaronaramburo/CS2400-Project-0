package CS2400;
import java.util.Scanner;
public class Project0 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Welcome to the Calculator.");
       System.out.println("Enter 'a' to add or 'q' to quit: ");
       
       String userInput = scanner.nextLine();

       if (userInput.equals("a")){
        add();
       } else if (userInput.equals("q")){
        System.out.println("Goodbye!");
        System.exit(0);
       } else {
        System.out.println("Invalid input, try again.");
       }




    }

    public static void add(){
    
    }

}
