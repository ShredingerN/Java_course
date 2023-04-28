package sem_1_HW;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.*;


//1. В данном варианте применила рекурсию, калькулятор работает, пока пользователь сам не остановит программу вводом 0.
//   Не уверена в корректности созданного метода =), но это был самый простой способ с реализацией рекурсии - запихать
//   все переменные внутрь метода, проверку деления на 0 и обработку исключения.
public class t3 {
    public static void main(String[] args) throws IOException {
        Calculator();
    }

    public static void Calculator() throws IOException {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("PLease enter operation(enter 0 for close program): \n+\n-\n/\n*\n^\nYour chose: ");
        char op = Scanner.next().charAt(0);
        if (op == '0') {
            System.out.print("Bye bye!");
        } else {
            try {
                System.out.print("Enter first number: ");
                double num1 = Scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = Scanner.nextDouble();
                switch (op) {
                    case '+':
                        System.out.println(num1 + num2);
                        Calculator();
                        break;
                    case '-':
                        System.out.println(num1 - num2);
                        Calculator();
                        break;
                    case '*':
                        System.out.println(num1 * num2);
                        Calculator();
                        break;
                    case '/':
                        if (num2 != 0) System.out.println(num1 / num2);
                        else System.out.println("Сan't divide by 0!Try again");
                        Calculator();
                        break;
                    case '^':
                        System.out.println(Math.pow(num1, num2));
                        Calculator();
                        break;
                    default:
                        System.out.println("Wrong operator! Try again");
                        Calculator();
                }
            } catch (InputMismatchException e) {
                System.out.println("Error! it's not a number. Try again");
                Calculator();
            }
        }
        logg();
    }

    public static void logg() throws IOException {
        Logger log = Logger.getLogger(String.valueOf(t3.class));
        FileHandler fh = new FileHandler(".\\src\\s1_task3\\calc.log");
        log.addHandler(fh);
        SimpleFormatter form = new SimpleFormatter();
        fh.setFormatter(form);
        log.log(Level.INFO, "Рассчет завершен");
    }

    /**
     * Вывести все простые числа от 1 до 1000
     */
    public static class t2 {
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
}
//    // 2. Простой вариант калькулятора
//    public static void main(String[] args) {
//        Scanner Scanner = new Scanner(System.in);
//        try {
//            System.out.print("Enter first number: ");
//            double number1 = Scanner.nextDouble();
//            System.out.print("PLease choose and enter one operation: \n+\n-\n/\n*\n^\nYour chose: ");
//            char operation = Scanner.next().charAt(0);
//            System.out.print("Enter second number: ");
//            double number2 = Scanner.nextDouble();
//            Scanner.close();
//            System.out.print("Result: " + Calculator(number1, number2, operation));
//        } catch (java.util.InputMismatchException e) {
//            System.out.println("Error! Not a number or wrong operation. Try again");
//        }
//
//    }
//
//    public static double Calculator(double a, double b, char op) {
//        double result = 0;
//        if (op == '+') result = a + b;
//        if (op == '-') result = a - b;
//        if (op == '*') result = a * b;
//        if (b != 0) {
//            if (op == '/') result = a / b;
//        } else {
//            System.out.println("Сan't divide by 0!Try again");
//        }
//        if (op == '^') result = Math.pow(a, b);
//        return result;
//    }
//}
