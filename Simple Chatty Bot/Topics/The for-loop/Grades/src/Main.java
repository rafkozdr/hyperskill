import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0, b = 0, c = 0, d = 0;

        for (int i = 1; i <= n; i++) {
            int g = sc.nextInt();

            if (g == 5) {
                a++;
            } else if (g == 4) {
                b++;
            } else if (g == 3) {
                c++;
            } else {
                d++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}