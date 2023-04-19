import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class DrinkingPlace {
    Semaphore d;
    int counter;
    int numberOfCows;


    public Semaphore getD() {
        return d;
    }

    public DrinkingPlace() {
        System.out.println("how many cows can drink at the same time?");
        Scanner sc = new Scanner(System.in);
        d = new Semaphore(sc.nextInt());
        this.counter = 0;

    }

    public DrinkingPlace(int d, int numberOfCows) {
        this.d = new Semaphore(d);
        this.counter = 0;
        this.numberOfCows = numberOfCows;
    }

    public void addToCounter() {
        counter++;
    }

}
