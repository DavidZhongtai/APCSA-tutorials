public class palindromcehcker2 {

    public static void main(String[] args) {

        System.out.println(countPalindromes("Help I have racecar"));

    }

    public static int countPalindromes(String sentence){
        //stopping condition
        String palindrome = sentence + "";

        int palindromecounter = 0;
        String wordCheck = "";

        for(int i = 0; i < palindrome.length(); i++){
            char ch = palindrome.charAt(i);

            //stopping
            if(ch!= ' '){
                wordCheck = wordCheck + ch;
            } else {
                if(isPalindrome(wordCheck))
                    palindromecounter++;
                wordCheck= "";
            }
            //extract words
        }
        return palindromecounter;
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
