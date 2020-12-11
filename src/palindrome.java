import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Palindrome");
        System.out.println("Enter Your Word: ");

        String inputWord = scanner.nextLine();

        if(isPalindrome(inputWord)){
            System.out.println("yes palindrome");
        } else{
            System.out.println("no plaindrome");
        }
    }

    public static boolean isPalindrome(String text){
        if(text.equals(reverse(text))){
            return true;
        } else{
            return false;
        }
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
