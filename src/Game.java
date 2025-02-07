import java.util.Scanner;

public class Game {
    public void play() {
        int random =  (int)Math.random()*10;

        while(true){
            var scanner = new Scanner(System.in);
            int input = scanner.nextInt();

            if (input==random){
                System.out.println("you guessed right");
                break;
            }
            else if (input>random){
                System.out.println("too high");
            } else if (input<random) {
                System.out.println("too low");
            }


        }

    }
}
