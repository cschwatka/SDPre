
import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    int age = input.nextInt();

    int currentYear = 2022;
    int birthYear = currentYear - age;
    int birthYear2 = currentYear - age - 1;

    System.out.println("You were either born in " + birthYear + " or " + birthYear2);
    input.close();
  }
}
