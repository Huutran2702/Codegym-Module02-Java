import java.util.Scanner;

public class DisplayFirst20PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of primes to display:  ");
        int input = scanner.nextInt();
        int count = 0;
        int N = 2;
        boolean check = true;
        System.out.print("The first " +input + " prime number are: ");
        System.out.print(N+"; ");
        N++;
        count+=1;
        while (count<input) {
            for (int i = 2;i<N-1;i++) {
                if (N%i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count+=1;
                System.out.print(N+"; ");
            }
            N++;
            check = true;
        }
    }
}
