public class TemperatureConversion {
    public static void main(String[] args) {
        // Declare two variables of type float
        float fahrenheit, centigrade;

        // Assign a value to the Fahrenheit variable
        fahrenheit = 98.6f;

        // Calculate and assign the Centigrade value
        centigrade = (5.0f / 9.0f) * (fahrenheit - 32);

        // Display the Fahrenheit and Centigrade values
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Centigrade: " + centigrade);

        // Using a for loop to print Centigrade values
        for (float i = 0.0f; i <= 40.0f; i += 4.0f) {
            float celsius = (5.0f / 9.0f) * (i - 32);
            System.out.println("Fahrenheit: " + i + ", Centigrade: " + celsius);
        }

        // Using a while loop to do the same
        float start = 0.0f;
        while (start <= 40.0f) {
            float celsius = (5.0f / 9.0f) * (start - 32);
            System.out.println("Fahrenheit: " + start + ", Centigrade: " + celsius);
            start += 4.0f;
        }
    }
}
