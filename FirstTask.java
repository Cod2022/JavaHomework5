import java.util.Map;

/*
 * Реализуйте структуру телефонной книги с помощью HashMap, 
 * учитывая, что 1 человек может иметь несколько телефонов.
 */

public class FirstTask {
    public Map<Integer, String> fillPhoneBook (Map<Integer, String> phoneBook) {
       phoneBook.put(234516, "Петров");
       phoneBook.put(334417, "Петров");
       phoneBook.put(224519, "Васильев");
       phoneBook.put(434526, "Иванов");
       phoneBook.put(956783, "Иванов");
       return phoneBook; 
    }

    public void getPhoneNumbers (Map<Integer, String> phoneBook, String surname) {
        for (Map.Entry<Integer, String> iteration : phoneBook.entrySet()) {
            if (iteration.getValue().equals(surname)) {
                System.out.println(iteration.getKey());
            }
        }
    }
}
