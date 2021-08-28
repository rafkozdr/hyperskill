import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int in = sc.nextInt();

        int a = in / 1000;
        int b = (in % 1000) / 100;
        int c = (in % 100) / 10;
        int d = in % 10;

        if (a == d && b == c) {
            System.out.println(1);
        } else {
            System.out.println(23);
        }
    }
}