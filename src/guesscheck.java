import java.util.Random;
import java.util.Scanner;

public class guesscheck {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Random number = new Random();

        int answer,guess;
        boolean guessed = false;

        int counter = 0;

        guess = number.nextInt(100)+1;

        System.out.println("Enter a number");
        System.out.println(guess);
        answer = reader.nextInt();

        if(guess == answer){
            counter++;
            System.out.println("This is the right guess ");
            System.out.println("It took " + counter + "guesses");
            guessed = true;
        }

        if(answer < guess){
            counter++;
            System.out.println("Higher");
            guessed = false;
        }

        if(answer > guess){
            counter++;
            System.out.println("Lower");
            guessed = false;
        }

        while(guessed != true){

            System.out.println("Enter a number");
            System.out.println(guess);
            answer = reader.nextInt();

            if(guess == answer){
                counter++;
                System.out.println("This is the right guess ");
                System.out.println("It took " + counter + " guesses");
                guessed = true;
            }

            if(answer < guess){
                counter++;
                System.out.println("Higher");
                guessed = false;
            }

            if(answer > guess){
                counter++;
                System.out.println("Lower");
                guessed = false;
            }
        }
    }
}
