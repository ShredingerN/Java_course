package seminars_online;

import java.util.ArrayList;

/**
 * Создать список типа ArrayList<String>.
 * Поместить в него как строки, так и целые числа.
 * Пройти по списку, найти и удалить целые числа.
 */
public class task_10 {
    public static void main(String[] args) {
        ArrayList<String> some_list = new ArrayList<>();
        some_list.add("str");
        some_list.add("1");
        some_list.add("ghjgjhk");
        some_list.add("4");
        some_list.add("str");
        some_list.add("3");
        some_list.add("rtuyi");
        some_list.add("tyui");
        System.out.println(some_list);

        some_list.removeIf(task_10::isDigit);

        System.out.println(some_list);
    }

    private static boolean isDigit(String str) {
        int test;
        try {
            test = Integer.parseInt(str);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}

