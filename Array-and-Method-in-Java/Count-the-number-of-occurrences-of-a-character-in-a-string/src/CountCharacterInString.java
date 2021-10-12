import java.util.Scanner;

public class CountCharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello world!";
        System.out.println("Enter character you want to count: ");
        String input = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (input.equalsIgnoreCase(String.valueOf(str.charAt(i)))) {
                count +=1;
            }
        }
        System.out.println("The number of occurrences of character "+input+" in a string is: " +count);
    }

}
