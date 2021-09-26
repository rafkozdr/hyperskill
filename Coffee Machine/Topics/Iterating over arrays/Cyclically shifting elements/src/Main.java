import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void shiftElement(int[] array, int number) {
        if (array.length <= 1) {
            return;
        }
        number = array[array.length - 1];
        int[] newArray = new int[array.length];
        newArray[0] = number;
        for (int i = 1; i < array.length; i++) {
            array[i] = newArray[i];
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] array = new int[len];


        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        shiftElement(array, array[array.length - 1]);
        System.out.println(Arrays.toString(array));
    }
}