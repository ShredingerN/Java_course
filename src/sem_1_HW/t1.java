package sem_1_HW;

/**
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */

import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        double number = Scanner.nextInt();
        Scanner.close();
        System.out.println("Треугольное число от " + number + " равно " + Triangle(number) +
                "\nФакториал - " + Factorial(number));
    }

    public static double Triangle(double num) {
        double res = 0;
        if (num == 0) return res;
        return res = (num * (num + 1)) / 2;
    }

    public static double Factorial(double num) {
        double res = 1;
        if (num == 0) return res;
        for (double i = 1; i <= num; i++) {
            res = res * i;
        }
        return res;
    }
}
