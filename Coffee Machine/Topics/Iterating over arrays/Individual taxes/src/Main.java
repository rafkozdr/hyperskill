
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] income = new int[n];
        int[] percentage = new int[n];
        for (int i = 0; i < n; i++) {
            income[i] = Integer.parseInt(scanner.next());
        }

        for (int i = 0; i < n; i++) {
            percentage[i] = Integer.parseInt(scanner.next());
        }
        int[] tax = new int[n];
        for (int i = 0; i < n; i++) {
            if  (income[i] == 0 || percentage[i] == 0) {
                tax[i] = 0;
            } else {
                tax[i] = income[i] * percentage[i] / 100;
            }
        }
        double BiggestIncome = 0;
        int counter = 0;

        if (n != 1) {
            for (int i = 0; i < n; i++) {
                if (tax[i] > BiggestIncome) {
                    BiggestIncome = tax[i];
                    counter = i;
                }
            }
        }
        System.out.println(counter + 1);
    }
}