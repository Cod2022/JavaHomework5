import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Задача 1
        System.out.println("Задача 1.");
        System.out.println();
        Map<Integer, String> phoneBook = new HashMap<>();
        FirstTask firstTask = new FirstTask();
        firstTask.fillPhoneBook(phoneBook);
        Scanner in = new Scanner(System.in, "ibm866");
        System.out.println("Введите фамилию для поиска: ");
        String surname = in.next();
        firstTask.getPhoneNumbers(phoneBook, surname);

        // Задача 2
        System.out.println();
        System.out.println("Задача 2.");
        SecondTask secondTask = new SecondTask();
        ArrayList<String> staffList = secondTask.fillList();
        secondTask.getNames(staffList);

        // Задача 3
        System.out.println();
        System.out.println("Задача 3.");
        ThirdTask thirdTask = new ThirdTask();
        String romanNumber = thirdTask.romanNumberInput();
        thirdTask.romanArabicConverter(romanNumber);
    }
}
