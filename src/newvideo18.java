import java.util.Scanner;

public class newvideo18 {
    public static void main(String[]args){
        String password = "let me in";
        System.out.println("Guess the password: ");

        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();

        System.out.println(password.equals(guess));
    }
}
