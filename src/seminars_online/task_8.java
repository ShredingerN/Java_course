package seminars_online;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Заполнить список десятью случайными числами.
 * Отсортировать список методом sort() и вывести его на экран.
 */
public class task_8 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        int max = 100;
        int length = 10;
        System.out.println("Old array:");
        List<Integer> newarr = addElToArr(list, length, max);
        System.out.println(newarr);
        Collections.sort(newarr);
        System.out.println("New array:");
        System.out.println(newarr);

//        ArrayList<Integer> array = new ArrayList<>(size);
//        Random rnd = new Random();
//        // double a = Math.random();
//        for (int i = 0; i < size; i++) {
//            array.add(rnd.nextInt(2, 10));
//        }
//        System.out.println(array);
//        Collections.sort(array);
//        System.out.println(array);

    }

    public static int randomToArr(int max) {
        Random r = new Random();
        int x = r.nextInt(max) + 1;
        return x;
    }

    public static List<Integer> addElToArr(List<Integer> list, int length, int max) {
        for (int i = 0; i < length; i++) {
            list.add(i, randomToArr(max));
        }
        return list;
    }
}
