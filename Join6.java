import java.util.Arrays;
public class Join6 {
  public static void main(String[] args) {


 int[] numbers = {1, 3, 5, 7, 9};
 int[] value = {2, 4, 6, 8, 10};

 int[] join = new int [numbers.length + value.length];

  int count = 0;

 for (int index = 0; index < numbers.length; index++) {
      join[count] = numbers[index];
       count++;

     join[count] = value[index];
     count++;
       }

  System.out.print(Arrays.toString(join));

 
 }

}