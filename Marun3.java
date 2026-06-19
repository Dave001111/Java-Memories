import java.util.Scanner;

public class Marun3 {
  public static void main(String[] args) {


 Scanner input = new Scanner(System.in);
 
 int[] value = new int[5];

 for (int index = 0; index < value.length; index++) {
System.out.print("Enter a number: "); 
value[index] = input.nextInt();
 }

for (int index = 0; index < value.length; index++) System.out.print(value[index] + ", ");
  
 


  }

}

