import java.util.Scanner;

public class passwordChecker {

    int passwordLength = 8;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Password");
        String password = scanner.nextLine();

        System.out.println(passwordCheck(password));

    }

    public static boolean passwordCheck(String password){

        String alphanum = "abcdefghijklmnopqrstuvwxyz1234567890";
        boolean realPass = true;
        if(password.length() >= 8){
            for(int i =0; i < password.length(); i++) {
                if ((alphanum.indexOf(password.toLowerCase().charAt(i)) != -1) && realPass != false){
                    //this line we can check the alphanum string and utilize the
                    // [-1] function return to simplify things
                    realPass = true;
                } else {
                    realPass = false;
                }

            }
        } else {
            return false;
        }

        return realPass;
    }
}
