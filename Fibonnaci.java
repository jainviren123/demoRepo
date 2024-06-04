import java.util.Scanner;

public class Fibonnaci {
    /**
     * fibonnaciSeries method gives series upto number n
     * @param size is the fibonnaci series upto n terms
     */
    static void fibonnaciSeries(int size){
        int firstTerm = 0;
        int secondTerm = 1;
        for (int current = 0;current<size;current++){
            System.out.print(firstTerm + ",");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        fibonnaciSeries(input);
    }
}
