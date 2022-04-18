import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /***********************/
        /* Mad Libs            */
        /***********************/

        System.out.println("Welcome to Mad Libs!");

        // Write your code here
        Scanner scanner = new Scanner(System.in);

        String mainPlace;
        String mainFood;
        String mainAnimal;

        System.out.println("Choose a place you want to go");
        mainPlace = scanner.nextLine();
        System.out.println("Choose a zoo animal");
        mainAnimal = scanner.nextLine();
        System.out.println("Pick a dinner dish");
        mainFood = scanner.nextLine();

        System.out.println("For many years, " + mainPlace + " was ruled by the terrifying " + mainAnimal + " alone. All that changed the day we discovered " + mainFood + ".");

    }
}