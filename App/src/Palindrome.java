public class Palindrome {

    public static void main(String[] args) {


        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Take input from user
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // Create stack
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters and build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed string
        boolean isPalindrome = input.equals(reversed);

        // Print result
        System.out.println("Input text: " + input + " is it palindrome? : " + isPalindrome);

        scanner.close();
    }
}