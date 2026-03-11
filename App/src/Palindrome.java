public class Palindrome {

    // PalindromeChecker class encapsulates palindrome logic
    static class PalindromeChecker {

        // Method to check if a string is palindrome
        public boolean checkPalindrome(String input) {
            // Simple two-pointer approach
            int start = 0;
            int end = input.length() - 1;

            while (start < end) {
                if (input.charAt(start) != input.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }

            return true;
        }
    }

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Take input
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker();

        // Call checkPalindrome() method
        boolean result = checker.checkPalindrome(input);

        // Print result
        System.out.println("Input text: " + input + " is it palindrome? : " + result);

        scanner.close();
    }
}