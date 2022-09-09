import java.util.Scanner;

public class newvideo20 {
    public static void main(String[]args) {
        System.out.println("How old are you");

        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Cats or Dogs");
        String animal = scanner.nextLine();

        if (age >= 12 && animal.equals("Dogs"))
            System.out.println("Welcome!");

        else System.out.println("Error!");

    }
}
