package Kr;

public class RandomGenerator {
    public static int getRandomIntBetween(int min, int max) {
        if (max < min) {
            int  temp = min;
            min = max;
            max = temp;
        }
        return (int) (Math.random() * (max - min + 1)) + min;

    }

    static void main() {
        for (int i = 0; i < 10; i++) {

            System.out.println("Random: int between 1 and 11: " + RandomGenerator.getRandomIntBetween(0, 5));
        }
    }
}
