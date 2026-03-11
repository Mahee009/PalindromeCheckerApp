public class Palindrome {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");
        System.out.print("Choice: ");
        int ch = sc.nextInt();

        PalindromeStrategy strategy;

        if (ch == 1)
            strategy = new StackStrategy();
        else
            strategy = new DequeStrategy();

        if (strategy.check(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray())
            stack.push(c);

        for (char c : input.toCharArray())
            if (c != stack.pop())
                return false;

        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        java.util.Deque<Character> dq = new java.util.ArrayDeque<>();

        for (char c : input.toCharArray())
            dq.add(c);

        while (dq.size() > 1)
            if (dq.removeFirst() != dq.removeLast())
                return false;

        return true;
    }
}