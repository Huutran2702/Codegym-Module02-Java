package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int choice;
        Scanner scanner = new Scanner(System.in);
        StopWatch stopWatch1 = new StopWatch();
        do {
            System.out.println("1. Start time");
            System.out.println("2. Stop ");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    stopWatch1.start();
                    System.out.print("Start time is: ");
                    System.out.println(stopWatch1.getStartTime());
                    break;
                case 2:
                    stopWatch1.stop();
                    System.out.print("Stop time is: ");
                    System.out.println(stopWatch1.getEndTime());
                    System.out.print("Elapsed time is: ");
                    System.out.println(stopWatch1.getElapsedTime() + " seconds");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        } while (choice > 0);
    }
}
