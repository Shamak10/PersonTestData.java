import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TestDataGenerator {
    public static void main(String[] args) {
        ArrayList<String> testData = new ArrayList<>();
        testData.add("000001, Bilbo, Baggins, Esq., 1060");
        testData.add("000002, Frodo, Baggins, Esq., 1120");
        testData.add("000003, Samwise, Gamgee, Esq., 1125");
        testData.add("000004, Peregrin, Took, Esq., 1126");
        testData.add("000005, Meridoc, Brandybuck, Esq., 1126");

        String fileName = "PersonTestData.txt";

        try {
            PrintWriter writer = new PrintWriter(new FileWriter(fileName));
            for (String record : testData) {
                writer.println(record);
            }
            writer.close();
            System.out.println("Test data saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving test data to file: " + e.getMessage());
        }
    }
}