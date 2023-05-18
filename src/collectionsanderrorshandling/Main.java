package collectionsanderrorshandling;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//List of integers with duplicates
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);

        try {
            // Use a Set to remove duplicates
            Set<Integer> uniqueNumbers = new HashSet<>(numbers);


            // Calculate the sum of the integers
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }

            // Throw an IndexOutOfBoundsException
//            int index = 10;
//            int element = numbers.get(index);

            // Calculate the average of the integers
            double average = (double) sum / numbers.size();

            //double average = -5;
            // Throw an IllegalArgumentException
            if (average < 0) {
                throw new IllegalArgumentException("Average is negative.");
            }

            // Throw an ArithmeticException
//            int dividend = 0;
//            int quotient = sum / dividend;

            // Print the sum, average, and the list of integers without duplicates
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            System.out.println("List without duplicates: " + uniqueNumbers);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Index out of bounds");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: Illegal argument");
        } catch (ArithmeticException e) {
            System.err.println("Error: Arithmetic exception");
        } finally {
            System.out.println("Program execution complete.");
        }

    }
}