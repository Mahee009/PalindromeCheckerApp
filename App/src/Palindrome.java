public class Palindrome {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Take input
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // Normalize input: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Two-pointer palindrome check
        int start = 0;
        int end = normalized.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print result
        System.out.println("Input text: " + input + " is it palindrome? : " + isPalindrome);

        scanner.close();
    }
}