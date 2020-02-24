// java.util.Scanner found at https://www.programiz.com/java-programming/basic-input-output
import java.util.Scanner;

/**
* The MicrowaveTime program implements an application that calculates how much 
* time a microwave should run depending on the item and how many of said item.
*
* @author  Bradley Wills
* @version 1.0
* @since   2020-02-23 
*/

public class MicrowaveTime {
  // Create variables 
  static double timeForOneItem;
  static double timeForAllItems;
  static double amount;
  
  /**
  * Calculates and outputs the amount of time depending on the item and how many of said item.
  */
  
  public static void main(String[] args) {
    // Create scanner also found at https://www.programiz.com/java-programming/basic-input-output
    Scanner userInput = new Scanner(System.in);
    // Ask for input
    System.out.println("What item are you microwaving?");
    try { 
      String item = userInput.nextLine(); 
      if (item.equals("sub") || item.equals("pizza") || item.equals("soup")) {
        if (item.equals("sub")) {
          // Assigns a value to the variable "timeForOneItem"
          timeForOneItem =  1;
        } else if (item.equals("pizza")) {
          // Assigns a value to the variable "timeForOneItem"
          timeForOneItem =  0.75;
        } else if (item.equals("soup")) {
          // Assigns a value to the variable "timeForOneItem"
          timeForOneItem =  1.75;
        }
        System.out.println("How many of that item are you microwaving?");
        try { 
          amount = userInput.nextInt(); 
          if (amount == 1 || amount == 2 || amount == 3) {
            timeForAllItems = ((amount - 1) / 2 + 1) * timeForOneItem;
            System.out.println("It will take " + timeForAllItems + " minutes to microwave " + amount + " " + item + ".");
          } else {
            // Informs user their input is invalid
            System.out.println("Invalid Input");
          }
        } catch (Exception e) {
          // Informs user their input is invalid
          System.out.println("Invalid Input");
        }
      } else {
        // Informs user their input is invalid
        System.out.println("Invalid Input");
      }
    } catch (Exception e) {
      // Informs user their input is invalid
      System.out.println("Invalid Input");
    }
  }
}