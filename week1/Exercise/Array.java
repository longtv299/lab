
import java.util.Arrays;
public class Array {
    public static void main(String[] agrs) {
        int[] myArray = {1789, 2035, 1899, 1456, 2013}; 
        System.out.println("Befort sorting:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("\nAfter sorting:");
        Arrays.sort(myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.println("Sum of array: " + sum);
        int average = sum / myArray.length;
        System.out.println("Average of array:" + average);
    }
}
