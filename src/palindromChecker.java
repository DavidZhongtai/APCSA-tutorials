public class palindromChecker {

    public static void main(String[] args) {

        String sentence = "This is my sentence";

        //methods
        String[] returnedArray = breakDownSentence(sentence);
        /*
        THIS ABOVE IS THE MAIN CASE TO BREAK DOWN SENTENCE
         */

//test loop to see if works
//        for (int i = 0; i < returnedArray.length; i++){
//            System.out.println(returnedArray[i]);
//        }
    }

    //break down sentence given an input
    public static String[] breakDownSentence(String sentence){

        //assign method variables
        String str = sentence;

        //string manipulation
        str.replaceAll(",", "");
        str.replaceAll(".", "");
        str.toLowerCase();

        //we split using string array and the return is an array
        String[] arrayString = str.split(" ");

        //return statmenet
        return arrayString;

    }
}

