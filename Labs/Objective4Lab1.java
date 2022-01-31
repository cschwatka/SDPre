import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your first name?");
    String fname = scanner.nextLine();

    System.out.println("What is your last name?");
    String lname = scanner.nextLine();

    System.out.println("What is your favorite animal?");
    String favoriteAnimal = scanner.nextLine();

    System.out.println("What is your favorite food?");
    String favoriteFood = scanner.nextLine();

    System.out.println("What is your favorite song?");
    String favoriteSong = scanner.nextLine();

    System.out.println("My name is " + fname + " " + lname + ".");
    System.out.println("My favorite animal is the " + favoriteAnimal + ".");
    System.out.println("My favorite food is " + favoriteFood + ".");
    System.out.println("My favorite song is " + favoriteSong + ".");

    /* some data input types and syntax issues here.  */

  }
}
