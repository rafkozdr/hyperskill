import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        int counter = 0;
        for (int y = 0; y < array.length; y++) {
            if (array[y] != findMax(array)) {
                counter++;
            }
        }

    }

    public static int findMax(int[] array) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        return array[len-1];

    }
}