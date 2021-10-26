
import java.util.Arrays;
import java.util.Stack;

public class ReverserStack {
    public static void main(String[] args) {

        int[] a = new int[]{0,1,2,3,4,5,6,7,8,9};
        Stack<Integer> stack = new Stack<>();
        for (int j : a) {
            stack.push(j);
        }
        System.out.println(stack);
        for (int i = 0; i < a.length ; i++) {
            a[i] = stack.pop();
        }
        System.out.println(Arrays.toString(a));

        String str = "Hello word!";
        Stack<Character> stack1 = new Stack<>();
        for (int i = 0; i < str.length() ; i++) {
            stack1.push(str.charAt(i));
        }
        System.out.println(stack1);
        String outp = "";
        for (int i = 0; i < str.length(); i++) {
            outp = outp + stack1.pop();
        }
        System.out.println(outp);
    }


}
