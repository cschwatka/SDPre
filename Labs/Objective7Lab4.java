public class Objective7Lab4 {
  public static void main(String[] args) {
    int sum = 0;
    int counter = 0;

    while(counter <= 20) {
      sum = counter + sum;
      counter = counter + 1;
      //Update the current sum by adding count to sum with each iteration.
    }
  System.out.println(sum);
  }
}
