import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class WalkingPlace {
    Semaphore w;

    public Semaphore getW() {
        return w;
    }

    public WalkingPlace() {
        System.out.println("how many cows can walk at the same time?");
        Scanner sc = new Scanner(System.in);
        w = new Semaphore(sc.nextInt());
    }

    public WalkingPlace(int w) {
        this.w = new Semaphore(w);
    }


}
