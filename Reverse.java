public class Reverse {
  public static void main(String[] args) {

 int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};


 int count = 9;

 for (int index = 0; index < numbers.length; index++) {
 System.out.print(numbers[count] + ", ");
 count--;
 
 if (count <= -1) {
 break;

 }
}







  }

}