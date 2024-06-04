import java.util.Scanner;


public class Vowelsconsonant {
    /**
     * vCount gives the number of vowels in the string
     * @param str is the user input string
     * @return the number of vowels
     */

    static int vCount(String str){
        String sLower = str.toLowerCase();
        return sLower.replaceAll("[^a-z]", "").replaceAll("[^aeiou]", "").length();
    }

    /**
     * cCount gives the number of consonant in the string
     * @param str is the user input string
     * @return the number of consonant
     */
    static int cCount(String str){
        String sLower = str.toLowerCase();
        return sLower.replaceAll("[^a-z]", "").replaceAll("[aeiou]", "").length();
    }

    //Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //input from user
        System.out.println("No.of vowels " + vCount(str));
        System.out.println("No.of consonant " + cCount(str));
    }
}
