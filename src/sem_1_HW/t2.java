package sem_1_HW;

/**
 * Вывести все простые числа от 1 до 1000
 */
public class t2 {
    public static void main(String[] args) {
        System.out.println("Простые числа в диапазоне от 0 до 1000: ");
        for (int i = 2; i < 1000; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if ((i % j) == 0) count++;
            }
            if (count < 2) System.out.println(i);
        }
    }
}
