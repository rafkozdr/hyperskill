import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String n = String.valueOf(a);
        n = new StringBuilder(n).reverse().toString();
        int end = Integer.parseInt(n);
        System.out.println(end);
    }
}