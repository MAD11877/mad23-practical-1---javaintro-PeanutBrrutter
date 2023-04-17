import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int integer = in.nextInt();
    while (integer!=0) {
      for (int i=integer; i>0; i--) {
        System.out.print("*");
      }
      System.out.println();
      integer--;
    }
  }
}
