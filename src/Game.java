import java.util.Scanner;

public class Game {
    private void Cheat() {
        System.out.println(random);
    }

    private int random;
    public void play() {
        random =  (int)(Math.random()*10);

        while(true){
            var scanner = new Scanner(System.in);
            System.out.print("enter an Input from 1 to 10: ");
            String input = scanner.nextLine();
            input=input.toLowerCase();

        if (input.equals("break")) {
            System.out.println("Aborting... \n Done");
            break;
        }
        else {
            int input2 = Integer.parseInt(input);
            if (input2 == random) {
                System.out.println("you guessed right");
                break;
            } else if (input2 == 1907)
                this.Cheat();
            else if (input2>10)
                System.out.println("Read the instructions");
            else if (input2 > random)
                System.out.println("too high");
            else if (input2 < random)
                System.out.println("too low");
        }
        }
    }
}
