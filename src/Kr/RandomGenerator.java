package Kr;

public class RandomGenerator {
    public static int getRandomIntBetween(int min, int max) {
        if (max < min) {
            int temp = min;
            min = max;
            max = temp;
        }
        return (int) (Math.random() * (max - min + 1)) + min;

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int lowerBound = 0;
            int upperBound = 100;
            System.out.println("Random: int between " + lowerBound + " and " + upperBound + " (including limits): " + RandomGenerator.getRandomIntBetween(lowerBound, upperBound));
        }
    }
}
