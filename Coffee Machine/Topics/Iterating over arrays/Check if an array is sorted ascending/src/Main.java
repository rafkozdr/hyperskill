import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        boolean isSorted = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                isSorted = false;
            }
        }
        System.out.println(isSorted);

    }
}
