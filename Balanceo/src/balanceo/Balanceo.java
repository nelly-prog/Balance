
package balanceo;
import java.util.Stack;
import java.util.Scanner;

public class Balanceo {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese expresiones en parentesis ");
        String expresion = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        for (char c : expresion.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    System.out.println("Expresion balanceada.");
                    return;
                }

                char abreparentesis = stack.pop();
                if ((c == ')' && abreparentesis != '(') ||
                    (c == ']' && abreparentesis != '[') ||
                    (c == '}' && abreparentesis != '{')) {
                    System.out.println("Expresion no balanceada.");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Esta balanceada.");
        } else {
            System.out.println("No esta balanceada.");
        }
    }  
}
