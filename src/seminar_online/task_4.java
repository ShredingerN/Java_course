package seminar_online;

/**
 * Дано четное число N (>0) и символы c1 и c2.
 * Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
 */
public class task_4 {
    public static void main(String[] args) {
        int num = 8;
        String c1 = "b";
        String c2 = "a";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num / 2; i++) {
            sb.append(c1);
            sb.append(c2);
        }
        System.out.print(sb);
    }
}

//import java.util.Scanner;
//
//
//    private static String generateString(int length, char c1, char c2){
//        StringBuilder builder = new StringBuilder();
//        for(int i=0;i<length/2;i++)
//            builder.append(String.format("%c%c", c1,c2));
//        return builder.toString();
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter first character: ");
//        char c1 = scanner.nextLine().charAt(0);
//        System.out.print("Enter second character: ");
//        char c2 = scanner.nextLine().charAt(0);
//        System.out.print("Enter length of string: ");
//        int length = scanner.nextInt();
//        System.out.printf("Result string: %s",generateString(length, c1, c2));
//        scanner.close();
//    }
