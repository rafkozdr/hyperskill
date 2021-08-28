import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = 0; //+1
        int s = 0; //-1
        int p = 0; //0

        for (int i = 1; i <= n; i++) {
            int detect = sc.nextInt();

            if (detect == 0) {
                p++;
            } else if (detect == 1) {
                l++;
            } else {
                s++;
            }
        }
        System.out.println(p + " " + l + " " + s);
    }
}