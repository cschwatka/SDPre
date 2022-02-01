import java.util.Scanner;
//import the Scanner class


public class Objective5Lab3 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    //create the scanner object`


    System.out.println("Please enter a number: ");

    int userNum = scanner.nextInt();
    //declare and initialize int and take it in from the user

    if(userNum > 0) {
      System.out.println("The number is positive.");
    }
    else if(userNum < 0) {
      System.out.println("The number is negative.");
    }
    else {
      System.out.println("The number is 0.");
    }

    // Determine if the number is greater than, less than, or equal to 0
    scanner.close();
  }
}
