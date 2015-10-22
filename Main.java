import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Cards Against Humanity!");
        System.out.println("Where anything goes.\n");
        startMenu();
    }

    public static void startMenu() {
        System.out.println("How many people want to play?");
        System.out.println("accepted value is 2 to 5 players.");
        String menu = keyboard.nextLine();
        switch (menu) {
            case "2":
                Engine.playerSetup(2);
                Engine.startGame();
                break;
            case "3":
                Engine.playerSetup(3);
                Engine.startGame();
                break;
            case "4":
                Engine.playerSetup(4);
                Engine.startGame();
                break;
            case "5":
                Engine.playerSetup(5);
                Engine.startGame();
                break;
            default:
                System.out.println("That's not a valid number.\nPlease try again.\n");
                startMenu();
                break;
        }
    }
}
