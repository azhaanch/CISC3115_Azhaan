import java.util.Scanner;

public class ImmutableObject {
    public static void main(String[] args) {
        // Declare the 2D array
        String[][] myArray = {
                {"BMW", "Ferrari", "Lambo"},
                {"pizza", "burger", "dumpling"}
        };

        // Declare two String variables
        String isin;
        String inputwords;

        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        do {
            // Print the prompt
            System.out.print("Enter a word: ");

            // Read the user input
            inputwords = scanner.nextLine();

            // Check if the input is "STOP"
            if (inputwords.equals("STOP")) {
                System.out.println("Program terminated.");
                break;
            }

            // Check if inputwords is in the 2D array
            isin = checkInArray(myArray, inputwords);

            if (isin != null) {
                System.out.println(inputwords + " is in the 2D array.");
            } else {
                System.out.println(inputwords + " is not in the 2D array.");
            }

        } while (true);

        // Close the scanner
        scanner.close();
    }

    // Method to check if a word is in the 2D array
    public static String checkInArray(String[][] array, String word) {
        for (String[] subArray : array) {
            for (String element : subArray) {
                if (element.equals(word)) {
                    return word;
                }
            }
        }
        return null;
    }
}
