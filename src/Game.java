public class Game {
    public void play(int input) {
        int random =  (int)Math.random()*10;

        while(true){
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
