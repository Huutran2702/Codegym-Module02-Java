public class DisplayPrimeNumberLessThan100 {
    public static void main(String[] args) {
        int N = 2;
        System.out.println("Prime numbers less than 100 are: ");
        System.out.print(N + "; ");
        N++;
        boolean check = true;
        while (N<100) {
            for (int i = 2; i<N-1; i++) {
                if (N%i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(N +"; ");
            }
            N++;
            check = true;
        }

    }
}
