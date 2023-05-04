package Sem_4.lesson4;

import java.util.*;

public class Homework {

    /**
     * Реализовать консольное приложение, которое:
     * <p>
     * 1. Принимает от пользователя и “запоминает” строки.
     * 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
     * 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
     * 4. Если введено exit, завершаем программу
     * <p>
     * Пример:
     * java
     * python
     * c#
     * print > [c#, python, java]
     * revert
     * print > [python, java]
     * kotlin
     * print > [kotlin, python, java]
     * revert
     * revert
     * revert
     * print > []
     * revert > Ошибка!
     * exit -> (Программа завершилась)
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку(print - печать; revert - удаление предыдущей строки; exit - выход)");
        LinkedList<String> list = new LinkedList<>();
        label:
        while (true) {
            String inputSt = sc.nextLine();
            switch (inputSt) {
                case "exit":
                    break label;
                case "print":
                    System.out.println("Печать строк в обратном порядке\n" + list);
                    break;
                case "revert":
                    if (!list.isEmpty()) {
                        list.removeFirst();
                        System.out.println("Удаление последней введеной строки из памяти:\n" + list);
                    } else {
                        System.out.println("Нет сохраненных строк");
                    }
                    break;
                default:
//                  по умалчанию задаем вставку каждого нового введенного пользователем элемента в начало списка
                    list.addFirst(inputSt);
                    break;
            }
        }
    }
}
