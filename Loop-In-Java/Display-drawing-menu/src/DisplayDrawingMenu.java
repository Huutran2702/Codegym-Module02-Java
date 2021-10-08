import java.util.Scanner;

public class DisplayDrawingMenu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu ");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle " +
                    "(The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Please choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    printRectangle();
                    break;
                case 2:
                    printSquareTriangle();
                    break;
                case 3:
                    printIsoscelesTriangle();
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("no choice!");
            }
        }
    }

    private static void printIsoscelesTriangle() {
        for (int i = 0; i<5; i++) {
            for (int j = 0;j < 5; j++) {
                if (j+i>=4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int k = 0; k<5;k++) {
                if (k<i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    private static void printSquareTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        for (int i = 5; i>0; i--) {
            for (int j = 0;j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        for (int i = 0; i<5; i++) {
            for (int j = 0;j < 5; j++) {
                if (j>=i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        for (int i = 0; i<5; i++) {
            for (int j = 0;j < 5; j++) {
                if (j+i>=4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    private static void printRectangle() {
        for (int i = 0;i < 3; i++ ) {
            for (int j = 0;j<7;j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
