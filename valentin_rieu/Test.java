import java.util.Random;

public class Test {
    public static final int TOTO = 4

    public static void main(String[] args) {
        System.out.println("Toto");

        Random rand = new Random();
        int randomNumber = rand.nextInt(0, 10);

        System.out.println("Random number : " + randomNumber)
    }
}
