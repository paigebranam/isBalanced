import java.util.Stack;

public class IsBalanced {
    public static void main(String args[]) {
        boolean test1 = isBalanced("()");
        System.out.println(test1);
        boolean test2 = isBalanced("(1 + 2)");
        System.out.println(test2);
        boolean test3 = isBalanced("(1 + 2()");
        System.out.println(test3);
        boolean test4 = isBalanced("(1 + 2");
        System.out.println(test4);
        boolean test5 = isBalanced(")(1 + 2)");
        System.out.println(test5);
        boolean test6 = isBalanced(")(1 + 2");
        System.out.println(test6);

    }

    public static boolean isBalanced(String expression) {
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < expression.length(); i++) {
            char variable = expression.charAt(i);
            if (variable == '(') {
                stack.push("(");
            } else if (variable == ')') {
                if (stack.empty()) {
                    return false;
                }
                String peek = stack.peek();
                if (peek.equals("(")) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }
}
