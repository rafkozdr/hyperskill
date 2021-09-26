import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int action = scanner.nextInt();
        String print = "You have chosen a ";
        switch (action) {
            case 1:
                System.out.println(print + "square");
                break;
            case 2:
                System.out.println(print + "circle");
                break;
            case 3:
                System.out.println(print + "triangle");
                break;
            case 4:
                System.out.println(print + "rhombus");
                break;
            default:
                System.out.println("There is no such shape!");
                break;
        }

    }
}