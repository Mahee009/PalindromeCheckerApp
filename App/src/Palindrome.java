public class Palindrome {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Take input from user
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using for loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed string
        if (input.equals(reversed)) {
            System.out.println("Input text: " + input + " is it palindrome? : true");
        } else {
            System.out.println("Input text: " + input + " is it palindrome? : false");
        }

        scanner.close();
    }
}