import java.util.Scanner;
import java.util.TreeMap;

public class CountOccurrencesOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        String str1 = str.toLowerCase();
        System.out.println(str1);
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char key = str1.charAt(i);
            System.out.println(key);
            if (key == ' ') {
                continue;
            }
            if (map.isEmpty()) {
                map.put(key, 1);
            } else {
                map.merge(key, 1, Integer::sum);
            }
        }
        System.out.println(map);
    }
}

