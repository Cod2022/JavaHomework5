import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Пусть дан список сотрудников:Иван Иванов 
 * Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
 * Отсортировать по убыванию популярности
 */

public class SecondTask {
    public ArrayList<String> fillList () {
        ArrayList<String> staffList = new ArrayList<>();
        staffList.add("Василий Иванов");
        staffList.add("Иван Васильев");
        staffList.add("Иван Петров");
        staffList.add("Дмитрий Викторов");
        staffList.add("Анна Сергеева");
        staffList.add("Сергей Сергеев");
        staffList.add("Дмитрий Дмитриев");
        staffList.add("Ирина Дмитриева");
        staffList.add("Анна Иванова");
        staffList.add("Дмитрий Васильев");
        staffList.add("Анна Викторова");
        staffList.add("Василиса Иванова");
        staffList.add("Дмитрий Сергеев");
        return staffList;
    }

    public void getNames (ArrayList<String> staffList) {
        Map<String, Integer> namesMap = new HashMap<>();
        String name = staffList.toString();
        String[] namesList = name.split(" ");

        for (int i = 0; i < namesList.length; i += 2) {
            if(namesMap.containsKey(namesList[i])) {
                namesMap.replace(namesList[i], namesMap.get(namesList[i]) + 1);
            } else {
                namesMap.put(namesList[i], 1);
            }
        }
        System.out.println("Исходный список имён: " + namesMap);

        Map<String, Integer> sortedNames = new LinkedHashMap<>();
        int max = 1;
        for (int value : namesMap.values()) {
            if (value > max) {
                max = value; 
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : namesMap.entrySet()) {
                String key = entry.getKey();
                if (namesMap.get(key) == i) {
                    sortedNames.put(key, namesMap.get(key));
                }
            }
        }
        System.out.println("Отсортированный по убыванию: " + sortedNames);


}
}
