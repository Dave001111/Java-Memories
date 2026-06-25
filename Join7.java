import java.util.Arrays;
public class Join7 {
 public static void main(String[] args) {

String[] items = {"rice", "beans", "garri", "fish", "meat"};
int[] numbers = {2, 3, 4, 5, 6};

  int [] join = new int [items.length + numbers.length];

 int count = 0;

for (int index = 0; index < items.length; index++) {
     join[count] = items[index];
      count++;


  join[count] = numbers[index];
     count++;

    }

   System.out.print(Arrays.toString(join));



 }

}