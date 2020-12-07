import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        int number;
        int total = 0;
        int digit = 0;

        for (int i = 1; i <= 500; i++){ //forloop to increment all values

            number = i; //assign the numebr we play with to increment

            while(number > 0){//this part pulls out digits and generate an armstrong number
                digit = number % 10; //pull remainder out
                total = total + (digit*digit*digit); //add to exisiting knowing the concept of armstonr ##
                number = number /10; //divide by 10 to move lower base and modulo again
            }

            if(total == i){ //compare generated to increment; if true then add in
                System.out.println("One armstrong number is " + i); //printout
            }
            total = 0; //reset total so no interference
        }

    }

}
