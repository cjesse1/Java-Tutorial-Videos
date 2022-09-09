import java.util.Scanner;

public class newvideo19 {
    public static void main(String[]args) {
        String password = "let me in";
        System.out.println("Guess the password: ");

        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();

        System.out.println(password.equals(guess));

        if(password.equals(guess))
        {
            System.out.println("Your guess is correct!");
        }
        else
        {
            System.out.println("Your guess is incorrect!");
        }

    }
}
