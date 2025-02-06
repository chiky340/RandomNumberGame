import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        Game game = new Game();
        int input = scanner.nextInt();
        game.play(input);

    }
}