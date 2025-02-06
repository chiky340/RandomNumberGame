import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        Game game = new Game();
        
        System.out.print("enter an input: ");
        int input = scanner.nextInt();
        game.play(input);

    }
}