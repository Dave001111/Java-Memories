import java.util.Scanner;

public class Scores {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
      
    System.out.print("Enter the score (enter -1 to stop: ");
    int scores = input.nextInt();

    while (scores != -1) {
   

   if (scores >= 80 && scores <= 100) {
     System.out.println("Congratulations Your grade is A");
  }

    else if (scores >= 60 && scores <= 79) {
       System.out.println("Congratulations your grade is B");
        }


   else if (scores >= 50 && scores <= 59) {
     System.out.println("Congratulations your grade is C");
     }

  else if (scores >= 40 && scores <= 49) {
      System.out.println("Your grade is D");
        }

 else if (scores >= 0 && scores <= 39 ) {
     System.out.println("You Failed. Try again next time");
      }

  else {
     System.out.println("Invalid score");
      }
     System.out.print("Enter score (-1 to stop): ");
      scores = input.nextInt();


  }

    
 









   }

}