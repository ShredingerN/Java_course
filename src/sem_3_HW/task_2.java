package sem_3_HW;

import java.util.ArrayList;
import java.util.Random;

/**
 * Пусть дан произвольный список целых чисел, удалить из него чётные числа
 */
public class task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> freeList = new ArrayList<>();
        int size = 10;
        for (int i = 0; i < size; i++) {
            freeList.add(new Random().nextInt(1000));
        }
        System.out.println("Исходный список чисел " + freeList);
        deleteEvenNumbers(freeList);
        System.out.println("Изменный список чисел " + freeList);
    }

    public static void deleteEvenNumbers(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) list.remove(i--);
        }
    }
}