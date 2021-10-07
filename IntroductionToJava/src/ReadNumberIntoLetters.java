import java.util.Scanner;

public class ReadNumberIntoLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        int hundred = number / 100;
        int tens = number / 10 - hundred * 10;
        int ones = number - hundred * 100 - tens * 10;
        if (hundred == 0) {
            if (tens == 0) {
                if (ones == 0) {
                    System.out.println("Zero");
                } else {
                    System.out.println(a(ones));
                }
            } else if (tens == 1) {
                if (ones == 0) {
                    System.out.println("ten");
                } else if (ones == 1) {
                    System.out.println("eleven");
                } else {
                    System.out.println(a(tens) + "teen");
                }
            } else if (tens == 2) {
                if (ones == 0) {
                    System.out.println("twen" + "ty");
                } else {
                    System.out.println("twen" + "ty " + a(ones));
                }
            } else {
                if (ones == 0) {
                    System.out.println(a(tens) + "ty");
                } else {
                    System.out.println(a(tens) + "ty " + a(ones));
                }
            }
        } else {
            if (tens == 0) {
                if (ones == 0) {
                    System.out.println(a(hundred) + " hundred");
                } else {
                    System.out.println(a(hundred) + " hundred " + "and " +  a(ones));
                }
            } else if (tens == 1) {
                if (ones == 0) {
                    System.out.println(a(hundred)+" hundred " + "and " + "ten");
                } else if (ones == 1) {
                    System.out.println(a(hundred)+" hundred " + "and " +"eleven");
                } else {
                    System.out.println(a(hundred) + " hundred " + "and " + a(tens) + " teen");
                }
            } else if (tens == 2) {
                if (ones == 0) {
                    System.out.println(a(hundred) +" hundred " +"and" + " twen" + "ty");
                } else {
                    System.out.println(a(hundred) +" hundred" +" and" + " twen" + "ty " + a(ones));
                }
            } else {
                if (ones == 0) {
                    System.out.println(a(hundred) + " hundred" +  " and " + a(tens) + "ty");
                } else {
                    System.out.println(a(hundred) + " hundred" + " and " +  a(tens) + "ty " + a(ones));
                }
            }
        }

    }

    public static String a(int a) {
        String c = "";
        switch (a) {
            case 1:
                c = "one";
                break;
            case 2:
                c = "two";
                break;
            case 3:
                c = "three";
                break;
            case 4:
                c = "four";
                break;
            case 5:
                c = "five";
                break;
            case 6:
                c = "six";
                break;
            case 7:
                c = "seven";
                break;
            case 8:
                c = "eight";
                break;
            case 9:
                c = "nine";
                break;
        }
        return c;
    }
}
