import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner myInput = new Scanner(System.in);
    int count = myInput.nextInt();
    int[] intArray = new int[count];
    int index = 0;
    while (index<count) {
      int integer = myInput.nextInt();
      intArray[index] = integer;
      index++;
    }
    myInput.close();
    int maxCount = 0, maxInt = 0;
    for (int mainIndex = 0; mainIndex < count; mainIndex++) {
      int intCount = 0;
      for (int countIndex = 0; countIndex < count; countIndex++) {
        if(intArray[mainIndex] == intArray[countIndex]) intCount++;
      }
      if (intCount > maxCount) {
        maxCount = intCount;
        maxInt = intArray[mainIndex];
      }
    }

    System.out.println(maxInt);
  }
}
