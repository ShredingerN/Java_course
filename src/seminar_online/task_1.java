package seminar_online;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s! \n", name);
        iScanner.close();
    }
}
