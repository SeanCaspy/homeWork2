import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class EatingPlace {
    Semaphore e;


    public Semaphore getE() {
        return e;
    }

    public EatingPlace(){
        System.out.println("how many cows can eat at the same time?");
        Scanner sc = new Scanner(System.in);
        e = new Semaphore(sc.nextInt());
    }

    public EatingPlace(int e) {
        this.e = new Semaphore(e);
    }
}
