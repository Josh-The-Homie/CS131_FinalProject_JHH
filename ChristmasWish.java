import java.util.Scanner;
/**
 * 
 * @author Joshua Henderson
 * The ChristmasWish program creates an array of type wish which has two different
 * elements(information and wish) the program stores the information for both in the array.
 * 
 */
public class ChristmasWish {

    public static void main(String[] args) {
        Wish[] wishArray = new Wish[10];
        Scanner scanner = new Scanner(System.in);
/*
 * The while loop is the main part of the program that lets it cycle infinitely and store everything
 */
        while (true) {
            System.out.println("What case number would you like to view?");
            System.out.println("Type the case number between 0-9");
            int picker = scanner.nextInt();
/**
 * Detects if the case number the user picked has information, 
 * if it doesn't it allows the user to pick a different case or change the information.
 * 
 */
            
            if (wishArray[picker] == null) {
                System.out.println("This case number is empty. Please choose what to add:");
                System.out.println("Type 1 to add wishlist, 2 to add information, and 3 to pick a different case");

                int fill = scanner.nextInt();
                scanner.nextLine(); // consume the remaining newline character

                if (fill == 1) {
                    System.out.println("What does the customer wish for?");
                    String wishset = scanner.nextLine();
                    wishArray[picker] = new Wish();
                    wishArray[picker].setWish(wishset);
                } else if (fill == 2) {
                    System.out.println("What is the customer's information?");
                    String infoset = scanner.nextLine();
                    wishArray[picker] = new Wish();
                    wishArray[picker].setInformation(infoset);
                } else {
                    continue; 
                }
            }

       //prints the information if it exists
            if (wishArray[picker] != null) {
                System.out.println("The information for case " + picker + " is:");
                if (wishArray[picker].getWish() != null) {
                    System.out.println("Wishlist: " + wishArray[picker].getWish());
                }
                if (wishArray[picker].getInformation() != null) {
                    System.out.println("Information: " + wishArray[picker].getInformation());
                }
//allows user to change the information if they want or pick a new case number.
                System.out.println("What do you want to change?");
                System.out.println("Type 1 to change the wish, 2 to change the information, and 3 to pick a different case");

                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    System.out.println("Enter new wish:");
                    String newWish = scanner.nextLine();
                    wishArray[picker].setWish(newWish);
                } else if (choice == 2) {
                    System.out.println("Enter new information:");
                    String newInfo = scanner.nextLine();
                    wishArray[picker].setInformation(newInfo);
                } else {
                    continue; 
                }
            }
        }
    }
}
