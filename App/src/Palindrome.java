public class Palindrome {
    static void main() {

        // Hardcoded string
        String text = "madam";

        // Reverse the string
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        // Check palindrome condition
        if (text.equals(reversed)) {
            System.out.println("Input text: " + text + " is it palindrome? : true");
        } else {
            System.out.println("Input text: " + text + " is it palindrome? : false");
        }
    }
}

