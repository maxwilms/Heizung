import java.util.Random;

public class Heizkoerper implements Runnable {
    static int number = 1;
    @Override
    public void run() {
        System.out.println("Staring Heizkoerper " + this.getInstanceNumber());        

        /*int result = 0;
        Random rand = new Random();
        for(int i = 0; i < 10; i++) {
            result = i + rand.nextInt(10);
            i = 1;
        }*/
        this.endlessLoop();
    }

    protected synchronized int getInstanceNumber() {
        return number++;
    }

    protected void endlessLoop() {
        int result = 0;
        Random rand = new Random();
        for(int i = 0; i < 10; i++) {
            result = i + rand.nextInt(10);
            i = 1;
        }
    }

}

