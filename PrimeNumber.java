import java.util.Scanner;
import java.util.Arrays;

public class PrimeNumber {
    /**
     * isPrime is the method which gives number is prime or not
     * * @param n is the input
     * @return the booleans value prime or not
     */
    static boolean isPrime(int size){
        if (size <= 1)
            return false;

        // Check from 2 to sqrt(n)
        for (int i= 2; i <= Math.sqrt(size); i++)
            if (size % i == 0)
                return false;

        return true;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Take the array size from the user
        System.out.println("Enter the size of the array: ");
        int arr_size = 0;
        if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
        }

        // Initialize the array's
        // size using user input
        int[] arr = new int[arr_size];

        // Take user elements for the array
        System.out.println(
                "Enter the elements of the array: ");
        for (int index = 0; index < arr_size; index++) {
            if (sc.hasNextInt()) {
                arr[index] = sc.nextInt();
            }
        }
        System.out.println("Prime numbers are : ");
        for (int index = 0; index < arr_size; index++) {
            if(isPrime(arr[index])){
                System.out.print(arr[index] + " ");
            }
        }

        Arrays.sort(arr);
        System.out.println("Largest number in array is :" + arr[arr.length-1]);
        System.out.println("Smallest number in array is :" + arr[0]);

    }
}
