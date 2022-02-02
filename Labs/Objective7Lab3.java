public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 1;
    String evenOdd;

    while(counter <= 20) {

      if(counter % 2 == 0) {
        evenOdd = "even";
      }
      else {
        evenOdd ="odd";
      }
        System.out.println(counter + " is " + evenOdd);
        counter = counter + 1;
    }
  }
}
