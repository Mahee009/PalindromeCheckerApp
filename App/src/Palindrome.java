public class Palindrome {

    // Recursive method to check palindrome
    static boolean isPalindrome(String str, int start, int end) {
        // Base condition: if start >= end, all characters matched
        if (start >= end) {
            return true;
        }

        // If characters at start and end do not match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call for next inner pair
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Take input from user
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // Call recursive method
        boolean result = isPalindrome(input, 0, input.length() - 1);

        // Print result
        System.out.println("Input text: " + input + " is it palindrome? : " + result);

        scanner.close();
    }
}