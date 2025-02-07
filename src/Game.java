import java.util.Scanner;

public class Game {
    private void Cheat() {
        System.out.println(random);;
    }

    private int random;
    public void play() {
        random =  (int)(Math.random()*10);

        while(true){
            var scanner = new Scanner(System.in);
            System.out.print("enter an Input: ");
            int input = scanner.nextInt();

            if (input==random){
                System.out.println("you guessed right");
                break;
            }
            else if (input>random){
                System.out.println("too high");
                continue;
            } else if (input<random) {
                System.out.println("too low");
                continue;
            } else if (input==1907) {
                this.Cheat();
                continue;
            }
        }
    }
}
