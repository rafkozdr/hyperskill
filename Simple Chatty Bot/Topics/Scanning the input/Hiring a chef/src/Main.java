import java.util.Scanner; //put imports you need here

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();
        String cuisinePreference = scanner.nextLine();

        System.out.println("The form for "
                + firstName +
                " is completed. We will contact you if we need a chef that cooks "
                + cuisinePreference +
                " dishes."); // put your code here
    }
}
