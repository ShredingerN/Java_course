package seminar_online;

/**
 * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
 */
public class task_2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                if (count > max)
                    max = count;
                count = 0;
            }
        }
        if (count > max)
            max = count;
        System.out.printf("максимальное количество подряд идущих 1 = %s", max);
    }
}

