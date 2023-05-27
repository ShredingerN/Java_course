package sem_3_HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка
 */
public class task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(new Random().nextInt(100));
        }
        System.out.println("Исходник " + arr);
        int min = Collections.min(arr);
        int max = Collections.max(arr);
        double ave = sumElements(arr);
        System.out.println("Мин. эл-т = " + min + " Макс. эл-т = " + max + " Cр.арифметическое = " + ave);

    }

    public static double sumElements(ArrayList<Integer> list) {
        double sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum / list.size();
    }
}