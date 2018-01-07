/*
Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.


Требования:
1. Инициализируй поле класса новым ArrayList<>
2. Программа должна считывать 5 строк с клавиатуры и записывать их в список strings.
3. Программа должна выводить самую длинную строку на экран.
4. Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(i, s);
            if (strings.get(i).length() > max) {
                max = strings.get(i).length();

            }
        }

        for (String string : strings) {
            if (max == string.length()) {
                System.out.println(string);
            }

        }

    }
}
