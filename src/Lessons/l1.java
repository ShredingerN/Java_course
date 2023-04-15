package Lessons; /**
 * коменты многострочные
 * <p>
 * привет,епти
 */

import java.util.Scanner;

public class l1 {
    public static void main(String[] args) {
        String s = "omsk";
        System.out.println(s); //коменты однострочные
        float g = 2.56F;// обязятелен суффикc f
        System.out.println(g);
        char a = '#';
        char b = 12;//неявное преобразование, в данном случае число станет символом
//      int можно неявно преобразить в double, ноборот нельзя
//      нужно будет делать преобразование
        int num = 52;
        double v = num;
        System.out.println(v);
        boolean h = 123 >= 234;
        System.out.println(h);
        boolean flag2 = 123 >= 234 || h;
        System.out.println(flag2);
//       неявная типизация
        var i = 123;
        int c = 12;
        System.out.println(Integer.MAX_VALUE);
        int m = 456;
        int n = 425;
        System.out.println(m++);
        System.out.println(m);
        var r = m * n;
        System.out.println(r);
        float x = 8.5F;
        System.out.println(x);
        i = i-- - --i; //???????????????
        System.out.println(i);
//      Побитовые сдвиги
        int df = 8;
//      в двоичной системе 1000
//      сдвигаем на 1 бит влево 10000
        System.out.println(df << 1);
        int sq = 18;
//      в двоичной системе 10010
//      сдвигаем на 1 бит враво - 1001
        System.out.println(df >> 1);
//      может быть быстрее вычислять корни с помощью этих операций.
//      Побитовые операции и, или, разд. или. По сути применяем правила лог операций в дв.кодировке
        int q1 = 5; //101
        int q2 = 2; //010
        System.out.println(q1 | q2); // q1 или q2
        System.out.println(q1 & q2);
        System.out.println(q1 ^ q2);
        boolean e = true;
        boolean t = true;
        System.out.println(e & t); //при сложном выражении эта операция проверяет левую и рпавую часть, может выйти exep.
        System.out.println(e && t); // эта проверяет только одну часть и выдает результат.(см правила лог.выражений!!!!)
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        int u = iScanner.nextInt();
        System.out.printf("double a: ");
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f \n", u, y, u + y);
        Scanner iScanner1 = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner1.nextLine();
        System.out.printf("Привет, %s! \n", name);
        Scanner iScanner2 = new Scanner(System.in);
        System.out.printf("int a: ");
//      проверка валидности введеных жанных
        boolean flag = iScanner2.hasNextInt();
        System.out.println(flag);
        int p = iScanner2.nextInt();
        System.out.println(p);
        iScanner.close();
//      конкатенация строк: низкая производительность, лучше не использовать.
//      в данном случае получаем 4 строки, d7,неявное преобразование, gh+d7, и потом только результирующая qw
        String d7 = "qwe";
        int gh = 123;
        String qw = d7 + gh;
        System.out.println(qw);
        int a1 = 1, b1 = 2;
        int c1 = a1 + b1;
//      для переменной используем так
        String res = String.format("%d + %d = %d \n", a1, b1, c1);
//      для printf ок
        System.out.printf("%d + %d = %d \n", a1, b1, c1);
        System.out.println(res);
        sayHi();
    }

    static void sayHi() {
        System.out.println("hi!");
    }

    static int sum(int a2, int b2) {
        return a2 + b2;
    }

    static double factor(int n1) {
        if (n1 == 1) return 1;
        return n1 * factor(n1 - 1);
    }

    static String getType(Object z) {
        return z.getClass().getSimpleName();
    }
}
//форматирование кода Ctrl+Alt+L