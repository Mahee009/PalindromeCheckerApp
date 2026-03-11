public class Palindrome {

    public static void main(String[] args) {


        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Take input from user
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // Convert string to character array
        char[] chars = input.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        System.out.println("Input text: " + input + " is it palindrome? : " + isPalindrome);

        scanner.close();
    }
}