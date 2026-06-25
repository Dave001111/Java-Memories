public class Join5 {
  public static void main(String[] args) {

 int[] numbers = {3, 9, 4, 1, 7};
 int[] value = {0, 2, 10, 5, 8,};

 int[] join = new int [numbers.length + value.length];


  int count = 0;

 for (int index = 0; index < numbers.length; index++) {
  join[count] = numbers[index];
  count++;

 join[count] = value[index];
   count++;

  }

 for (int index = 0; index < join.length; index++) {
      System.out.print(join[index] + ", ");

    }

 

  }
}
