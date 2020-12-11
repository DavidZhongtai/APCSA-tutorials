import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Palindrome");
        System.out.println("Enter Your Word: ");

        String inputWord = scanner.nextLine();

    }

    public static boolean isPalindrome(String text){
        return true;
    }

    public static String reverse(String text){

        String reverseString = ""; //declare return var

        for(int indexReverse = text.length() - 1; indexReverse >=0; indexReverse--){
            //decrement as we are workign backwards
            reverseString = reverseString + text.charAt(indexReverse); //add it on in end
        }
        return reverseString;
    }

}
