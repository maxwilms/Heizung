public class Heizung
{
    
    public static void main(String[] args)
    {
        int power;

        if (args.length == 1) {
            power = Integer.parseInt(args[0]);
            System.out.println("Setting power to "+ power);
        } else {
            power = 8;
            System.out.println("No power set, heating at level " + power);
        }

        for (int i = 0; i < power; i++) {
            Thread koerper = new Thread(new Heizkoerper());
            koerper.start();
        }
    }

}

