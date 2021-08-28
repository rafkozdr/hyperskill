import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int n = sc.nextInt();

        int count = 0;

        for (int i = start; i <= end; i++) {
            if (i % n == 0) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}