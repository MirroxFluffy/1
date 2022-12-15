import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter length of the array");
      Scanner x = new Scanner(System.in);
     int ArrayLength = x.nextInt();
     int[] array = new int[ArrayLength];
        System.out.println("Array's length is - " + ArrayLength);
        System.out.println("Type array's values of every each element: ");
        Scanner z = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = z.nextInt();
        }
        System.out.println("Values of the array that have been typed - " + Arrays.toString(array));
    }
}