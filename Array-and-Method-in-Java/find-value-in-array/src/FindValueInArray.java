import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String findName;
        int indexOfName = -1;
        String[] studentName = new String[]{
                "Nguyen Van A",
                "Nguyen Van B",
                "Nguyen Van C",
                "Nguyen van D"
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name you want to find:  ");
        findName = sc.nextLine();

        for (int i = 0; i < studentName.length; i++) {
            if (findName.equals(studentName[i])) {
                indexOfName = i;
            }
        }
        if (indexOfName == -1) {
            System.out.println("Does not find " + findName + " in the student list ");
        } else {
            System.out.println(findName + " is at " + indexOfName+ " position on the student list");
        }
    }
}
