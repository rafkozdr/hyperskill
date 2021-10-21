import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean isBetween = false;
        if (a >= b && a <= c || a <= b && a >= c) {
            isBetween = true;
        }
        System.out.println(isBetween);
    }
}
