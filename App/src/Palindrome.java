public class Palindrome {

    public static void main(String[] args) {


        java.util.Scanner scanner = new java.util.Scanner(System.in);


        // Take input
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // Create Queue and Stack
        java.util.Queue<Character> queue = new java.util.LinkedList<>();
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);   // enqueue
            stack.push(ch);  // push
        }

        boolean isPalindrome = true;

        // Compare dequeue (queue) and pop (stack)
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove(); // dequeue
            char fromStack = stack.pop();    // pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input text: " + input + " is it palindrome? : " + isPalindrome);

        scanner.close();
    }
}