public class Palindrome {

    public static void main(String[] args) {


        java.util.Scanner scanner = new java.util.Scanner(System.in);


        // Take input from user
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // Create Deque
        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare first and last characters
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input text: " + input + " is it palindrome? : " + isPalindrome);

        scanner.close();
    }
}