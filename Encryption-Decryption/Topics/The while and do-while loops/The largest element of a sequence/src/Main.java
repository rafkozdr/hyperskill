import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int largestElement = 0;
         int number = 0;

         do {
             number = sc.nextInt();
//             System.out.println();
             if (number > largestElement) {
                 largestElement = number;
             }
         } while (number != 0);

        System.out.println(largestElement);
    }
}