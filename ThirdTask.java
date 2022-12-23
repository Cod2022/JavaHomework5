import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Написать метод, который переведет число из римского формата записи в арабский. 
 * Например, MMXXII = 2022
 */

public class ThirdTask {
    public void romanArabicConverter (String romanNumber) {
        char[] romanChars = romanNumber.toCharArray();
        Map<Character, Integer> romanArabicMap = new HashMap<>();
        romanArabicMap.put('I', 1);
        romanArabicMap.put('V', 5);
        romanArabicMap.put('X', 10);
        romanArabicMap.put('L', 50);
        romanArabicMap.put('C', 100);
        romanArabicMap.put('D', 500);
        romanArabicMap.put('M', 1000);

        int lastSymbol = romanChars.length-1;
        int count;
        int result = romanArabicMap.get(romanChars[lastSymbol]);
        
        for (int i = lastSymbol-1; i >= 0; i--) {
            count = romanArabicMap.get(romanChars[i]);
            if (count < romanArabicMap.get(romanChars[i + 1])) {
                result -= count; 
            } else {
                result += count;
            }
        }
        System.out.println("Результат конвертации: " + result);
    }

    public String romanNumberInput () {
        Scanner in = new Scanner(System.in, "ibm866");
        System.out.println("Введите число в римском формате: ");
        String number = in.next();
        in.close();
        return number;
    }
}
