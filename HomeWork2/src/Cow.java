import java.util.Random;
import java.util.concurrent.Semaphore;

public class Cow extends Thread {
    private int station;
    private EatingPlace e;
    private DrinkingPlace d;
    private WalkingPlace w;

    public Cow(EatingPlace e, DrinkingPlace d, WalkingPlace w) throws InterruptedException {
        this.e = e;
        this.d = d;
        this.w = w;
    }


    @Override
    public void run() {
        Random rand = new Random();
        for (station = 0; station < 3; station++) {
            int randomNumber = rand.nextInt((10 - 2) + 1) + 2;
            if (station == 0) {
                try {
                    e.getE().acquire();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                System.out.println(Thread.currentThread() + " is eating");
                try {
                    Thread.sleep(randomNumber * 100);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                e.getE().release();
            } else if (station == 1) {
                try {
                    d.getD().acquire();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                System.out.println(Thread.currentThread() + " is drinking");
                try {
                    Thread.sleep(randomNumber * 100);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                d.getD().release();
            } else {
                try {
                    w.getW().acquire();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                try {
                    Thread.sleep(randomNumber * 100);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                System.out.println(Thread.currentThread() + " is walking");
                w.getW().release();
            }
//
        }

    }
}
