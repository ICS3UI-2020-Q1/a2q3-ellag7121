import java.util.Scanner;
/**
 * get 2 integers from the user, tells user the numbers in ascending order
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner to get user input
    Scanner input = new Scanner(System.in);

    //initialize variables
    int integerA; //the first integer given by the user
    int integerB; //the second integer given by the user

    //ask user for first integer
    System.out.println("Please enter an integer:");
    //store the user's first integer in a variable
    integerA = input.nextInt();

    //ask user for second integer
    System.out.println("Please enter another integer:");
    //store the user's second integer in a variable
    integerB = input.nextInt();

    //check if first integer is bigger or equal to the second
    if (integerA >= integerB){
      //tell user integers in ascending order
      System.out.println("Your numbers in ascending order are " + integerB + ", " + integerA);
    }else{ //if second integer is bigger
      //tell user integers in ascending order
      System.out.println("Your numbers in ascending order are " + integerA + ", " + integerB);
    }
  }
}
