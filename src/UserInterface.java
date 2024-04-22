import java.util.Scanner;

// Klasa zarządzająca interfejsem użytkownika
class UserInterface {
    private Scanner scanner;

    public UserInterface() {
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("1. Triangle");
        System.out.println("2. Rectangle");
        System.out.println("3. Diamond");
        System.out.println("4. 3D");
        System.out.println("5. Exit");
    }

    public void start() {
        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    processTriangle();
                    break;
                case 2:
                    processRectangle();
                    break;
                case 3:
                    processDiamond();
                    break;
                case 4:
                    processThreeDim();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private void processTriangle() {
        try {
            System.out.print("Enter side A length: ");
            double sideA = scanner.nextDouble();
            System.out.print("Enter side B length: ");
            double sideB = scanner.nextDouble();
            System.out.print("Enter side C length: ");
            double sideC = scanner.nextDouble();

            Triangle triangle = new Triangle(sideA, sideB, sideC);
            triangle.print();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid triangle: " + e.getMessage());
        }
    }

    private void processRectangle() {
        try {
            System.out.print("Enter length: ");
            double length = scanner.nextDouble();
            System.out.print("Enter width: ");
            double width = scanner.nextDouble();

            Rectangle rectangle = new Rectangle(length, width);
            rectangle.print();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid rectangle: " + e.getMessage());
        }
    }

    private void processDiamond() {
        try {
            System.out.print("Enter diagonal 1 length: ");
            double diagonal1 = scanner.nextDouble();
            System.out.print("Enter diagonal 2 length: ");
            double diagonal2 = scanner.nextDouble();

            Diamond diamond = new Diamond(diagonal1, diagonal2);
            diamond.print();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid diamond: " + e.getMessage());
        }
    }

    private void processThreeDim() {
        try {
            System.out.println("Enter the type of base: ");
            System.out.println("1. Triangle");
            System.out.println("2. Rectangle");
            System.out.print("Enter your choice: ");
            int baseChoice = scanner.nextInt();

            Figure base;
            switch (baseChoice) {
                case 1:
                    System.out.print("Enter side A length of the triangle: ");
                    double sideA = scanner.nextDouble();
                    System.out.print("Enter side B length of the triangle: ");
                    double sideB = scanner.nextDouble();
                    System.out.print("Enter side C length of the triangle: ");
                    double sideC = scanner.nextDouble();
                    base = new Triangle(sideA, sideB, sideC);
                    break;
                case 2:
                    System.out.print("Enter length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width of the rectangle: ");
                    double width = scanner.nextDouble();
                    base = new Rectangle(length, width);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    return;
            }

            System.out.print("Enter height of the solid: ");
            double height = scanner.nextDouble();

            ThreeDim threeDim = new ThreeDim(base, height);
            threeDim.print();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid solid: " + e.getMessage());
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}
