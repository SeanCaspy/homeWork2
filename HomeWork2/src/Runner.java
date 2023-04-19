import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        EatingPlace e = new EatingPlace(2);
        DrinkingPlace d = new DrinkingPlace(1,5);
        WalkingPlace w = new WalkingPlace(3);
        Scanner sc = new Scanner(System.in);
        System.out.println("how many cows are in the farm?");
        //int cows = sc.nextInt();
        Cow cow[] = new Cow[5];
        for(int i = 0; i < 5; i++){
            cow[i] = new Cow(e,d,w);
        }
        for(int i = 0; i < 5; i++){
            cow[i].start();
        }

    }
}
