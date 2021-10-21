import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        int n = 1;
        long sum = 1;

        while (sum <= m) {
            n++;
            sum *= n;
        }
        System.out.println(n);
    }
}