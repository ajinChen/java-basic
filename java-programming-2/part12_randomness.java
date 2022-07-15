import java.util.Random;

public class part12_randomness {
    public static void main(String[] args) {

        // Create random object
        Random randomObj = new Random();
        
        // Generate random int （0-99）
        int randomNumber = randomObj.nextInt(100);

        // Generate random double between (0.0-1.0)
        double probability = randomObj.nextDouble();

        // Generate random Gaussian Distribution number
        double gaussNum = randomObj.nextGaussian();
    }
}
