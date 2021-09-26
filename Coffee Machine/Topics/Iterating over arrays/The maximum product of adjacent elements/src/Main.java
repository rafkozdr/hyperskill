import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        int pair = 0;
        for (int y = 0; y < len - 1; y++) {
            int biggestPair = array[y] * array[y + 1];
            if (biggestPair > pair) {
                pair = biggestPair;
            }
        }

        System.out.println(pair);
    }
}