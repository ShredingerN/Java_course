package sem_2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

/**
 * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */
public class task_2 {
    public static void main(String[] args) throws IOException, SecurityException {
        int[] array = {55, 33, 45, 5, 7, 4, 8, 12};
        Logger log = Logger.getLogger(String.valueOf(task_2.class.getClass()));
        FileHandler viewlog = new FileHandler(".\\src\\sem_2\\log_task2.xml");
        log.addHandler(viewlog);
        XMLFormatter xml = new XMLFormatter();
        viewlog.setFormatter(xml);
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            log.log(Level.INFO, "Итерация");
        }
        log.log(Level.INFO, "Массив отсортирован: " + Arrays.toString(array));
    }
}