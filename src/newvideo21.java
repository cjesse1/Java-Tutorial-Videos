import java.util.Scanner;

public class newvideo21 {
    public static void main(String[]args){
        System.out.println("What's your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        switch (name) {
            case "Jesse":
            System.out.println("Welcome my man!");
                break;
            case "ope":
            System.out.println("Go away!");
            break;
        }
    }
}
