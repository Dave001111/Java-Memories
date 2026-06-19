import java.util.Scanner;

public class NumbersAmount {

  public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

       String choice = "yes";
       int countZero = 0;
       int countPositive = 0;
       int countNegative = 0;

     while (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

             
 if (number == 0 ) {
     countZero++;
  }

 if (number > 0) {
     countPositive++;
}
 
if (number < 0) {
    countNegative++;
}
             System.out.print("Do you want to continue?: (yes/no):");
             choice = input.next();

      while (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")) {
             System.out.print("Invalid option. Enter yes or no");

     System.out.print("Do you want to continue?: (yes/no):");
     choice = input.next();
  }

}

 System.out.println("Number of zeros is: " + countZero);
 System.out.println("Number of positives is: " + countPositive);
 System.out.println("Number of negative is: " + countNegative);

   
  









 }

}