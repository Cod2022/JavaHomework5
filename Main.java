import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Map<Integer, String> phoneBook = new HashMap<>();
        // FirstTask firstTask = new FirstTask();
        // firstTask.fillPhoneBook(phoneBook);
        // Scanner in = new Scanner(System.in, "ibm866");
        // String surname = in.next();
        // firstTask.getPhoneNumbers(phoneBook, surname);

        SecondTask secondTask = new SecondTask();
        ArrayList<String> staffList = secondTask.fillList();
        secondTask.getNames(staffList);
    }
}
