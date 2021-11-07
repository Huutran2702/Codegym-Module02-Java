import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Enter number to convert: ");
        int number = scanner.nextInt();
        while (number!=0) {
           if (number%2==0) {
               stack.add(0);
               number= number/2;
           } else {
               stack.add(1);
               number= (number-1)/2;
           }
        }
        String binary = "";
        do {
            binary += stack.pop();
        } while (stack.size()>0);
        System.out.println(stack);
        System.out.print("Number to convert binary is: ");
        System.out.print(binary);
    }
}
