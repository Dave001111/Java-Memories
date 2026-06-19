import java.util.Scanner;

public class Marun2 {
  public static void main(String[] args) {


 Scanner input = new Scanner(System.in);
 
 int[] value = new int[5];

 System.out.print("Enter a number: ");
 value[0] = input.nextInt();

 System.out.print("Enter a number: ");
 value[1] = input.nextInt();

 System.out.print("Enter a number: ");
 value[2] = input.nextInt();

 System.out.print("Enter a number: ");
 value[3] = input.nextInt();

 System.out.print("Enter a number: ");
 value[4] = input.nextInt();



for (int index = 0; index< value.length; index++) {
System.out.print(value[index] + ", ");
  }
 


  }

}

