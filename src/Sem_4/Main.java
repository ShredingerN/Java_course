package Sem_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        List<Integer> intList = Arrays.asList(integers);

        intList.set(2, -1);
        System.out.println(intList);

        intList.add(10);


        List<String> list = new ArrayList<>(List.of("str", "1", "add", "Java", "2", "-5"));
////        list.remove(2);
//
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String item = iterator.next();
//            if (isInteger(item)) {
//                iterator.remove();
//            }
//        }
//
////        list.removeIf(s -> isInteger(s));
//        System.out.println(list);
    }

    private static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}