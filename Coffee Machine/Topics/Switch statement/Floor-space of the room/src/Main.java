import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        double area = 0;
        switch (shape) {
            case "triangle":
                double a = scanner.nextInt();
                double b = scanner.nextInt();
                double c = scanner.nextInt();
                double h = (a + b + c) / 2; //half of circumference;
                area = Math.sqrt(h * (h  - a) * (h - b) * (h - c));

                break;
            case "rectangle":
                a = scanner.nextInt();
                b = scanner.nextInt();
                area = a * b;
                break;
            case "circle":
                double r = scanner.nextInt();
                area = r * r * 3.14;
                break;
            default:
                break;
        }
        System.out.println(area);
    }
}