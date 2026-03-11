public class Palindrome {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        // Stack Strategy Time
        PalindromeStrategy s1 = new StackStrategy();
        long start1 = System.nanoTime();
        boolean r1 = s1.check(input);
        long end1 = System.nanoTime();

        // Deque Strategy Time
        PalindromeStrategy s2 = new DequeStrategy();
        long start2 = System.nanoTime();
        boolean r2 = s2.check(input);
        long end2 = System.nanoTime();

        System.out.println("Stack Result: " + r1);
        System.out.println("Stack Time: " + (end1 - start1) + " ns");

        System.out.println("Deque Result: " + r2);
        System.out.println("Deque Time: " + (end2 - start2) + " ns");
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for(char c : input.toCharArray())
            stack.push(c);

        for(char c : input.toCharArray())
            if(c != stack.pop())
                return false;

        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean check(String input) {

        java.util.Deque<Character> dq = new java.util.ArrayDeque<>();

        for(char c : input.toCharArray())
            dq.add(c);

        while(dq.size() > 1)
            if(dq.removeFirst() != dq.removeLast())
                return false;

        return true;
    }
}